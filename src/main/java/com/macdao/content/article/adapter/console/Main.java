package com.macdao.content.article.adapter.console;

import com.macdao.content.article.adapter.map.MapArticleRepository;
import com.macdao.content.article.application.ArticleApplicationService;
import com.macdao.content.article.domain.model.article.Article;
import com.macdao.content.article.domain.model.article.Product;

import java.util.List;

import static java.util.Collections.singletonList;

public class Main {
    public static void main(String[] args) {
        final ArticleApplicationService articleApplicationService = new ArticleApplicationService(new MapArticleRepository());

        final Article article = new Article("An article title", "An article content", singletonList(new Product("002852", "招商财富宝A")));
        articleApplicationService.createArticle(article);

        articleApplicationService.publish(article.getId());

        List<Article> articleList = articleApplicationService.getArticles();

        System.out.println(articleList.size());
        System.out.println(articleList.get(0).getStatus());
    }
}
