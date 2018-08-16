package com.macdao.content.article.adapter.mysql;

import com.macdao.content.article.domain.model.article.Article;
import com.macdao.content.article.domain.model.article.ArticleId;
import com.macdao.content.article.domain.model.article.ArticleRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MysqlArticleRepository implements ArticleRepository {

    private final JdbcTemplate jdbcTemplate;

    public MysqlArticleRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Optional<Article> findById(ArticleId id) {
        return jdbcTemplate.query("select * from article where id = ?",
            new Object[]{id.getValue()},
            (rs, rowNum) -> new Article(new ArticleId(rs.getString("id"))))
            .stream().findFirst();
    }
}
