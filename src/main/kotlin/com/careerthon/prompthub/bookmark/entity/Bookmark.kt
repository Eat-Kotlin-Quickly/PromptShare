package com.careerthon.prompthub.bookmark.entity

import com.careerthon.prompthub.prompt.entity.Prompt
import com.careerthon.prompthub.user.entity.User
import jakarta.persistence.*

@Entity
@Table(name = "bookmark")
class Bookmark(
    isBookMark: Boolean,
    user: User,
    prompts: Prompt
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var bookmarkId: Long? = null
        protected set
    var isBookMark: Boolean = isBookMark
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    var user: User = user
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prompts_id", nullable = false)
    var prompts: Prompt = prompts
        protected set
}