package com.careerthon.prompthub.like.entity

import com.careerthon.prompthub.prompt.entity.Prompt
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
class Like(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val prompt: Prompt,

    var isLike: Boolean = true
)