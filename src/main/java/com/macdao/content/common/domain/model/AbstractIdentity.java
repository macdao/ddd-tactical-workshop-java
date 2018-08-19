package com.macdao.content.common.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
@Getter
public abstract class AbstractIdentity implements Identity {
    private final String value;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + value + ')';
    }
}
