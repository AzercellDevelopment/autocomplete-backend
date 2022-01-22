package com.azercell.hackathon.models.common

import com.azercell.hackathon.models.enums.CategoryType
import javax.persistence.*

@Entity
@Table(name = "categories")
data class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val title: String? = null,
    val imageUrl: String? = null,
    @Enumerated(EnumType.STRING)
    val type: CategoryType = CategoryType.PRODUCT
)