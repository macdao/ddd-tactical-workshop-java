package com.macdao.content.article.domain.model.article;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Getter
public class Article {

    public enum ArticleStatus {
        Draft,
        Published
    }

    public Article() {
        id = new ArticleId(UUID.randomUUID().toString());
        status = ArticleStatus.Draft;
    }

    private final ArticleId id;
    @Setter
    private String title;
    @Setter
    private String content;
    private final List<Product> products = new ArrayList<>();
    private ArticleStatus status;

    public void publish() {
        status = ArticleStatus.Published;
    }

}
