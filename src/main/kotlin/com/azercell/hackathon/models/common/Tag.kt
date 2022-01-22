package com.azercell.hackathon.models.common

import javax.persistence.*

@Entity
@Table(name = "tags")
data class Tag(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val title: String? = null
)