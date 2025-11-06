package com.careerthon.prompthub.like.entity

import com.careerthon.prompthub.prompt.entity.Prompt
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "likes")
class Like(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,

    private var prompt: Prompt,

    private var isLike: Boolean = true
)