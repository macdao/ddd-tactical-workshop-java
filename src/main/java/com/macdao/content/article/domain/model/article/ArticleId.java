package com.macdao.content.article.domain.model.article;

import com.macdao.content.common.domain.model.AbstractIdentity;

import java.util.UUID;

public class ArticleId extends AbstractIdentity {
    public ArticleId() {
        super(UUID.randomUUID().toString());
    }

    public ArticleId(String value) {
        super(value);
    }
}
