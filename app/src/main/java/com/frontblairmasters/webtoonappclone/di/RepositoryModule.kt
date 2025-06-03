package com.frontblairmasters.webtoonappclone.di

import com.frontblairmasters.webtoonappclone.data.repository.MangaDexRepository
import com.frontblairmasters.webtoonappclone.data.repository.MangaDexRepositoryReal
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMangaDexRepository(
        mangaDexRepository: MangaDexRepositoryReal
    ) : MangaDexRepository
}