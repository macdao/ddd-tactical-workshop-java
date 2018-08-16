package com.macdao.content.article.adapter.mysql;

import com.macdao.content.article.domain.model.article.Article;
import com.macdao.content.article.domain.model.article.ArticleId;
import com.macdao.content.article.domain.model.article.ArticleRepository;

import java.util.List;
import java.util.Optional;

//import org.springframework.jdbc.core.JdbcTemplate;

//@Repository
public class MysqlArticleRepository implements ArticleRepository {

//    private final JdbcTemplate jdbcTemplate;

//    public MysqlArticleRepository(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public Optional<Article> findById(ArticleId id) {
//        return jdbcTemplate.query("select * from article where id = ?",
//            new Object[]{id.getValue()},
//            (rs, rowNum) -> {
//                final ArticleId id1 = new ArticleId(rs.getString("id"));
//                return new Article(id1);
//            })
//            .stream().findFirst();
        return null;
    }

    @Override
    public Article save(Article article) {
        return null;
    }

    @Override
    public List<Article> findAll() {
        return null;
    }
}
