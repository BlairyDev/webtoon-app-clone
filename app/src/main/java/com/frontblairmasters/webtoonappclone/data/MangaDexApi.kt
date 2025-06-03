package com.frontblairmasters.webtoonappclone.data

import com.frontblairmasters.webtoonappclone.data.model.MangaDexApiResponse
import com.frontblairmasters.webtoonappclone.model.MangaListResponse
import retrofit2.Response
import retrofit2.http.GET

interface MangaDexApi {
    @GET("/manga")
    suspend fun getMangaList() : Response<MangaListResponse>
}