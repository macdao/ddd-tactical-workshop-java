package com.macdao.content.article.domain.model.article;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository {
    Optional<Article> findById(ArticleId id);

    Article save(Article article);

    List<Article> findAll();
}
