package com.anushka.newsapiclient.presentation.di

import com.anushka.newsapiclient.data.repository.dataSource.NewsLocalDataSource
import com.anushka.newsapiclient.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import com.anushka.newsapiclient.db.ArticleDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {
    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO): NewsLocalDataSource{
        return NewsLocalDataSourceImpl(articleDAO)
    }

}