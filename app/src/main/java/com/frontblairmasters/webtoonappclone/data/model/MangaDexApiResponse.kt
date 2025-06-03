package com.frontblairmasters.webtoonappclone.data.model

import com.frontblairmasters.webtoonappclone.model.MangaListResponse

sealed class MangaDexApiResponse {
    data class Success(val mangaList: List<MangaListResponse.Data>) : MangaDexApiResponse()
    data object Error : MangaDexApiResponse()
}