package com.careerthon.prompthub.user.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
class User(
    googleLocalId: Long,
    googleEmail: String,
    googleFullName: String,
    photoUrl: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var userId: Long? = null
        protected set

    @Column(nullable = false)
    var googleLocalId: Long = googleLocalId
        protected set

    @Column(nullable = false)
    var googleEmail: String = googleEmail
        protected set

    @Column(nullable = false)
    var googleFullName: String = googleFullName
        protected set

    var photoUrl: String = photoUrl
        protected set
}