package com.careerthon.prompthub.prompt.entity

import jakarta.persistence.Entity

import jakarta.persistence.*
import org.hibernate.annotations.Comment
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import java.util.UUID

@Entity
class Prompt(
    @Id
    @GeneratedValue
    val id: String = UUID.randomUUID().toString(),

    @Column(nullable = false, length = 50)
    @Comment(value = "제목")
    var title: String,

    @Column(columnDefinition = "TEXT")
    @Comment(value = "설명")
    var description: String? = null,

    @Column(columnDefinition = "TEXT")
    @Comment(value = "프롬프트 내용")
    var content: String? = null,

    @Comment(value = "결과 이미지")
    var imgUrl: String? = null,

    @Enumerated(EnumType.STRING)
    @Comment(value = "프롬프트 사용한 AI")
    var type: AIType,

    @Enumerated(EnumType.STRING)
    @Comment(value = "프롬프트 카테고리")
    var category: PromptCategory,

    @Comment(value = "생성일자")
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @LastModifiedDate
    @Comment(value = "수정일자")
    var updatedAt: LocalDateTime? = null,
) {
    fun update(
        title: String,
        description: String?,
        content: String?,
        imgUrl: String?,
        type: AIType,
        category: PromptCategory
    ) {
        this.title = title
        this.description = description
        this.content = content
        this.imgUrl = imgUrl
        this.type = type
        this.category = category
    }
}
