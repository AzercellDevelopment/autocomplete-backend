package com.azercell.hackathon.models.product

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
data class ProductImage(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val imageUrl: String? = null,
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    val product: Product? = null
)