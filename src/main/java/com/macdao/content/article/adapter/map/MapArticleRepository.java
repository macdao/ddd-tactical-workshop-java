package com.macdao.content.article.adapter.map;

import com.macdao.content.article.domain.model.article.Article;
import com.macdao.content.article.domain.model.article.ArticleId;
import com.macdao.content.article.domain.model.article.ArticleRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MapArticleRepository implements ArticleRepository {
    private final Map<ArticleId, Article> articleMap = new HashMap<>();

    @Override
    public Optional<Article> findById(ArticleId id) {
        return Optional.ofNullable(articleMap.get(id));
    }

    @Override
    public Article save(Article article) {
        return articleMap.put(article.getId(), article);
    }

    @Override
    public List<Article> findAll() {
        return new ArrayList<>(articleMap.values());
    }
}
