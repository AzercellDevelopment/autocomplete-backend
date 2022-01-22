package com.azercell.hackathon.models.product

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "owners")
data class ProductOwner(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val fullName: String? = null,
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    val product: Product? = null
)