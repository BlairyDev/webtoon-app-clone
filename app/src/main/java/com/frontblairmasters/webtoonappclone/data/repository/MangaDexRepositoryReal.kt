package com.frontblairmasters.webtoonappclone.data.repository

import android.util.Log
import com.frontblairmasters.webtoonappclone.data.MangaDexApi
import com.frontblairmasters.webtoonappclone.data.model.MangaDexApiResponse
import javax.inject.Inject

class MangaDexRepositoryReal @Inject constructor(
    private val mangaDexApi: MangaDexApi
) : MangaDexRepository {
    override suspend fun getMangaList(): MangaDexApiResponse {
        val result = mangaDexApi.getMangaList()
        return if (result.isSuccessful) {

            MangaDexApiResponse.Success(result.body()?.data ?: emptyList())
        } else {
            MangaDexApiResponse.Error
        }

    }
}