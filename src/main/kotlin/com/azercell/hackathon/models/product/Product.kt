package com.azercell.hackathon.models.product

import com.azercell.hackathon.models.common.Category
import com.azercell.hackathon.models.common.Tag
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "products")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val title: String? = null,
    val description: String? = null,
    val upvotes: Int? = null,
    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    val category: Category? = null,
    @OneToMany
    val tags: List<Tag> = listOf(),
    @OneToMany(mappedBy = "product")
    val owners: List<ProductOwner> = listOf(),
    @OneToMany(mappedBy = "product")
    val images: List<ProductImage> = listOf(),
    @OneToMany(mappedBy = "product")
    val comments: List<ProductComment> = listOf()
) {
    @JsonIgnore
    fun imageUrl() = this.images.firstOrNull()?.imageUrl.orEmpty()
}