package com.azercell.hackathon.models.common

import com.azercell.hackathon.models.proposal.Proposal
import javax.persistence.*

@Entity
@Table(name = "companies")
data class Company(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val title: String? = null,
    val imageUrl: String? = null,
    val description: String? = null,
    @OneToMany
    val proposals: List<Proposal> = listOf(),
    @OneToMany
    val tags: List<Tag> = listOf()
)