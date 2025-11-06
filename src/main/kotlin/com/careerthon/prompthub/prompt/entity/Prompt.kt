package com.careerthon.prompthub.prompt.entity

import jakarta.persistence.Entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Prompt(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

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
        this.updatedAt = LocalDateTime.now()
    }
}
