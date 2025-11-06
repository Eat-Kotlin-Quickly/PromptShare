package com.careerthon.prompthub.prompt.entity

import jakarta.persistence.Entity

import jakarta.persistence.*
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
    var title: String,

    @Column(columnDefinition = "TEXT")
    var description: String? = null,

    @Column(columnDefinition = "TEXT")
    var content: String? = null,

    var imgUrl: String? = null,

    @Enumerated(EnumType.STRING)
    var type: AIType,

    @Enumerated(EnumType.STRING)
    var category: PromptCategory,

    val createdAt: LocalDateTime = LocalDateTime.now(),

    @LastModifiedDate
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
