package com.macdao.content.article.domain.model.article;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@EqualsAndHashCode
public class Product {
    public final String code;
    public final String name;
}
