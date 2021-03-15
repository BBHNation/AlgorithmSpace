package com.algorithm.space.hancock.offer.solution.common;

public class NotImplementException extends RuntimeException {
    private String content;

    public NotImplementException(String content) {
        this.content = content;
    }

    @Override
    public String getMessage() {
        return content;
    }
}
