package com.frontblairmasters.webtoonappclone.ui


import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import com.frontblairmasters.webtoonappclone.model.MangaListResponse
import com.frontblairmasters.webtoonappclone.ui.common.composables.WebtoonGrid
import com.frontblairmasters.webtoonappclone.viewmodel.MangaDexListViewModel

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    mangaDexListViewModel: MangaDexListViewModel = hiltViewModel()
) {

    var sessionId by remember { mutableStateOf<String?>(null) }
    var mangaList by remember { mutableStateOf(listOf<MangaListResponse.Data>()) }
    mangaDexListViewModel.fillData()

    LaunchedEffect(Unit) {
        mangaDexListViewModel.mangaList.collect { event ->
            when (event) {
                MangaDexListViewModel.MangaDexListState.Failure -> {
                    Log.i("TAG", "error")
                }
                MangaDexListViewModel.MangaDexListState.Loading -> {
                    Log.i("TAG", "loading")
                }
                is MangaDexListViewModel.MangaDexListState.Success -> {
                    Log.i("TAG", "success" + event.mangaData[0])
                    mangaList = event.mangaData

                }

            }
        }
    }




    Column(
        modifier = Modifier.padding(15.dp)
    ) {
        HomeContent()
    }

}

@Composable
fun HomeContent(modifier: Modifier = Modifier) {
    WebtoonGrid()
}


