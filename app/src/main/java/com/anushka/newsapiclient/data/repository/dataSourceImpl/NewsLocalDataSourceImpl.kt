package com.anushka.newsapiclient.data.repository.dataSourceImpl

import com.anushka.newsapiclient.data.model.Article
import com.anushka.newsapiclient.data.repository.dataSource.NewsLocalDataSource
import com.anushka.newsapiclient.db.ArticleDAO
import kotlinx.coroutines.flow.Flow

class NewsLocalDataSourceImpl(
    private val articleDAO: ArticleDAO
): NewsLocalDataSource {
    override suspend fun saveArticleToDB(article: Article) {
        articleDAO.insert(article)
    }

    override fun getSavedArticles(): Flow<List<Article>> {
        return articleDAO.getAllArticles()
    }

    override suspend fun deleteArticlesFromDB(article: Article) {
        articleDAO.deleteArticle(article)
    }
}