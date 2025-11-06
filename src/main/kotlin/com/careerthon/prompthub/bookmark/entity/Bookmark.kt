package com.careerthon.prompthub.bookmark.entity

import com.careerthon.prompthub.prompt.entity.Prompt
import com.careerthon.prompthub.user.entity.User
import jakarta.persistence.*

@Entity
@Table(name = "bookmark")
class Bookmark{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val bookmarkId: Long? = null

    @Column(nullable = false)
    var isBookMark: Boolean? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prompts_id", nullable = false)
    val prompt: Prompt? = null

}