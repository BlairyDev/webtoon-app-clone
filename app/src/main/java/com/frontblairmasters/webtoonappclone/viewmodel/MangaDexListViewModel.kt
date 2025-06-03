package com.frontblairmasters.webtoonappclone.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.frontblairmasters.webtoonappclone.data.model.MangaDexApiResponse
import com.frontblairmasters.webtoonappclone.data.repository.MangaDexRepository
import com.frontblairmasters.webtoonappclone.model.MangaListResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MangaDexListViewModel @Inject constructor(
    private val mangaDexRepository: MangaDexRepository
): ViewModel() {

    private val _mangaList = MutableStateFlow<MangaDexListState>(MangaDexListState.Loading)
    val mangaList: StateFlow<MangaDexListState> = _mangaList.asStateFlow()

    fun fillData() = viewModelScope.launch {
        when (val response = mangaDexRepository.getMangaList()) {
            MangaDexApiResponse.Error -> _mangaList.value = MangaDexListState.Failure
            is MangaDexApiResponse.Success -> _mangaList.value = MangaDexListState.Success(response.mangaList)
        }
    }

    sealed class MangaDexListState {
        data class Success(val mangaData: List<MangaListResponse.Data>): MangaDexListState()
        data object Failure: MangaDexListState()
        data object Loading: MangaDexListState()
    }
}