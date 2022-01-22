package com.azercell.hackathon.dto

import com.azercell.hackathon.models.common.Company
import com.azercell.hackathon.models.proposal.Proposal
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

data class ProposalDto(
    val id: Long? = null,
    val title: String? = null,
    val upvotes: Int? = null,
    val problemText: String? = null,
    val solutionText: String? = null,
    val company: Company? = null
) {
    constructor(item: Proposal): this(item.id, item.title, item.upvotes, item.problemText, item.solutionText, item.company)
}