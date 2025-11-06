package com.careerthon.prompthub.prompt

import jakarta.persistence.Entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Prompt(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,

    @Column(nullable = false, length = 50)
    private var title: String,

    @Column(columnDefinition = "TEXT")
    private var description: String,

    @Column(columnDefinition = "TEXT")
    private var content: String,

    private var imgUrl: String,

    @Enumerated(EnumType.STRING)
    private var type: AIType,

    @Enumerated(EnumType.STRING)
    private var category: PromptCategory,

    private var createdAt: LocalDateTime = LocalDateTime.now(),

    private var updatedAt: LocalDateTime? = null,
) {
    fun update(title: String, description: String?, content: String, imgUrl: String?, type: AIType, category: PromptCategory) {
        this.updatedAt = LocalDateTime.now()
    }
}
