package com.frontblairmasters.webtoonappclone.data.repository

import com.frontblairmasters.webtoonappclone.data.model.MangaDexApiResponse

interface MangaDexRepository {
    suspend fun getMangaList() : MangaDexApiResponse
}