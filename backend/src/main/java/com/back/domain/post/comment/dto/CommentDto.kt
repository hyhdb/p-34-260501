package com.back.domain.post.comment.dto

import com.back.domain.post.comment.entity.Comment
import java.time.LocalDateTime

@JvmRecord
data class CommentDto(
    val id: Int,
    val content: String,
    val authorId: Int,
    val authorName: String,
    val createDate: LocalDateTime?,
    val modifyDate: LocalDateTime?
) {
    constructor(comment: Comment) : this(
        comment.getId(),
        comment.getContent(),
        comment.getAuthor().getId(),
        comment.getAuthor().getName(),
        comment.getCreateDate(),
        comment.getModifyDate()
    )
}
