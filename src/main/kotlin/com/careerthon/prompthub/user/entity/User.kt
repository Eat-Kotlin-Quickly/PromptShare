package com.careerthon.prompthub.user.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val userId: Long? = null

    @Column(nullable = false)
    val googleLocalId: Long? = null

    @Column(nullable = false)
    var googleEmail: String? = null

    @Column(nullable = false)
    var googleFullName: String? = null

    var photoUrl: String? = null
}