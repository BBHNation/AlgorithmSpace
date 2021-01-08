package com.algorithm.space.hancock.solution.common;

public class NoticeException extends RuntimeException {
    private String content;

    public NoticeException(String content) {
        this.content = content;
    }

    @Override
    public String getMessage() {
        return content;
    }
}
