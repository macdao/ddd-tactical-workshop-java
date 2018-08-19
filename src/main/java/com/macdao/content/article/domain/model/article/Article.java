package com.macdao.content.article.domain.model.article;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Article {

    public enum ArticleStatus {
        DRAFT,
        PUBLISHED,
        DELETED
    }

    public Article(String title, String content, List<Product> products) {
        id = new ArticleId();
        status = ArticleStatus.DRAFT;
        this.title = title;
        this.content = content;
        this.products = new ArrayList<>(products);
    }

    private final ArticleId id;
    private String title;
    private String content;
    private final List<Product> products;
    private ArticleStatus status;

    public void publish() {
        status = ArticleStatus.PUBLISHED;
    }

}
