package com.azercell.hackathon.models.proposal

import com.azercell.hackathon.models.common.Company
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "proposals")
data class Proposal(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val title: String? = null,
    val upvotes: Int? = null,
    val problemText: String? = null,
    val solutionText: String? = null,
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    val company: Company? = null
)