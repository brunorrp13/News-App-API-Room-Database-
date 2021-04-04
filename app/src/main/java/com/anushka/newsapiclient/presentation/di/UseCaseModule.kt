package com.anushka.newsapiclient.presentation.di

import com.anushka.newsapiclient.domain.repository.NewsRepository
import com.anushka.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase
import com.anushka.newsapiclient.domain.usecase.GetSavedNewsUseCase
import com.anushka.newsapiclient.domain.usecase.GetSearchedNewsUseCase
import com.anushka.newsapiclient.domain.usecase.SaveNewsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
   @Singleton
   @Provides
   fun provideGetNewsheadLinesUseCase(
       newsRepository: NewsRepository
   ):GetNewsHeadlinesUseCase{
      return GetNewsHeadlinesUseCase(newsRepository)
   }

   @Singleton
   @Provides
   fun provideGetSearchedNewsUseCase(
      newsRepository: NewsRepository
   ):GetSearchedNewsUseCase{
      return GetSearchedNewsUseCase(newsRepository)
   }

   @Singleton
   @Provides
   fun provideSaveSearchedNewsUseCase(
      newsRepository: NewsRepository
   ): SaveNewsUseCase {
      return SaveNewsUseCase(newsRepository)
   }

   @Singleton
   @Provides
   fun provideGetSavedNewsUseCase(
      newsRepository: NewsRepository
   ): GetSavedNewsUseCase {
      return GetSavedNewsUseCase(newsRepository)
   }
}


















