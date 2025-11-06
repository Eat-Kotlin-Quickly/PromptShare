package com.careerthon.prompthub.like

import com.careerthon.prompthub.prompt.Prompt
import jakarta.persistence.*

@Entity
@Table(name = "likes")
class Like(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,

    private var prompt: Prompt,

    private var isLike: Boolean = true
)
