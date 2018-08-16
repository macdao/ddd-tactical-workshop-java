package com.macdao.content.article.domain.model.article;

import java.util.Optional;

public interface ArticleRepository {
    Optional<Article> findById(ArticleId id);
}
