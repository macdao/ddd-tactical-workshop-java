package com.macdao.content.article.application;

import com.macdao.content.article.domain.model.article.Article;
import com.macdao.content.article.domain.model.article.ArticleId;
import com.macdao.content.article.domain.model.article.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleApplicationService {
    private final ArticleRepository articleRepository;

    public ArticleApplicationService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public Optional<Article> getArticle(ArticleId articleId) {
        return articleRepository.findById(articleId);
    }

    public void createArticle(Article article) {
        articleRepository.save(article);
    }

    public List<Article> getArticles() {
        return articleRepository.findAll();
    }

    public void publish(ArticleId articleId) {
        final Optional<Article> articleOptional = articleRepository.findById(articleId);
        articleOptional.ifPresent(article -> {
            article.publish();
            articleRepository.save(article);
        });
    }
}
