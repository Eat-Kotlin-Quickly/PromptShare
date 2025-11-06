package com.careerthon.prompthub.reply.entity

import com.careerthon.prompthub.prompt.entity.Prompt
import com.careerthon.prompthub.user.entity.User
import jakarta.persistence.*

@Entity
@Table(name = "reply")
class Reply{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(nullable = false)
    var replyContent: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    var user: User? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prompts_id", nullable = false)
    var prompt: Prompt? = null

    fun updateContent(replyContent: String) {
        this.replyContent = replyContent
    }
}