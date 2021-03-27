package com.anushka.newsapiclient.data.repository.dataSource

import com.anushka.newsapiclient.data.model.Article

interface NewsLocalDataSource {
    suspend fun saveArticleToDB(article: Article)


}