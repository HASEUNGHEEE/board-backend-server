package com.sparta.springweb.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sparta.springweb.model.Post;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostResponseDto {
    private final Long id;
    private final String name;
    private final String title;
    private final String content;
    private final String filePath;

    private final int countReply;

    private Long countPostLike;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private final LocalDateTime createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private final LocalDateTime modifiedAt;

    @Builder
    public PostResponseDto(Post post, int countReply, Long countPostLike) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.name = post.getName();
        this.filePath = post.getFilePath();
        this.content = post.getContent();
        this.createdAt = post.getCreatedAt();
        this.modifiedAt = post.getModifiedAt();
        this.countReply = countReply;
        this.countPostLike = countPostLike;
    }
}
