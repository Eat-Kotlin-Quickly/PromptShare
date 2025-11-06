package com.careerthon.prompthub.reply.entity

import com.careerthon.prompthub.prompt.entity.Prompt
import com.careerthon.prompthub.user.entity.User
import jakarta.persistence.*

@Entity
@Table(name = "reply")
class Reply(
    replyContent: String,
    user: User,
    prompts: Prompt
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
        protected set
    @Column(nullable = false)
    var replyContent = replyContent
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    var user: User = user
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prompts_id", nullable = false)
    var prompt: Prompt = prompts
        protected set

    fun updateContent(replyContent: String) {
        this.replyContent = replyContent
    }
}