package com.macdao.content.article.adapter.console;

import com.macdao.content.article.adapter.map.MapArticleRepository;
import com.macdao.content.article.application.ArticleApplicationService;
import com.macdao.content.article.domain.model.article.Article;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final ArticleApplicationService articleApplicationService = new ArticleApplicationService(new MapArticleRepository());

        final Article article = new Article();
        article.setTitle("An article title");
        article.setContent("An article content");
        articleApplicationService.createArticle(article);

        articleApplicationService.publish(article.getId());

        List<Article> articleList = articleApplicationService.getArticles();

        System.out.println(articleList.size());
        System.out.println(articleList.get(0).getStatus());
    }
}
