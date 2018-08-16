package com.macdao.content.article.adapter.api;

import com.macdao.content.article.application.ArticleApplicationService;
import com.macdao.content.article.domain.model.article.Article;
import com.macdao.content.article.domain.model.article.ArticleId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/content/articles")
public class ArticleController {
    private final ArticleApplicationService articleApplicationService;

    public ArticleController(ArticleApplicationService articleApplicationService) {
        this.articleApplicationService = articleApplicationService;
    }

    @GetMapping("/{articleId}")
    public ResponseEntity<Article> getArticle(@PathVariable ArticleId articleId) {
        return articleApplicationService.getArticle(articleId)
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
