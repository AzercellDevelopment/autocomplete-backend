package com.azercell.hackathon.models.idea

import com.azercell.hackathon.models.common.Category
import com.azercell.hackathon.models.common.Tag
import javax.persistence.*

@Entity
@Table(name = "ideas")
data class BusinessIdea(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val title: String? = null,
    val upvotes: Int? = null,
    val description: String? = null,
    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    val category: Category? = null,
    @OneToMany
    val tags: List<Tag> = listOf()
)