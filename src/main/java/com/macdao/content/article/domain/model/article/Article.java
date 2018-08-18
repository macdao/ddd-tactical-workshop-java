package com.macdao.content.article.domain.model.article;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class Article {

    public enum ArticleStatus {
        DRAFT,
        PUBLISHED,
        DELETED
    }

    public Article(String title, String content) {
        id = new ArticleId(UUID.randomUUID().toString());
        status = ArticleStatus.DRAFT;
        this.title = title;
        this.content = content;
    }

    private final ArticleId id;
    private String title;
    private String content;
    private final List<Product> products = new ArrayList<>();
    private ArticleStatus status;

    public void publish() {
        status = ArticleStatus.PUBLISHED;
    }

}
