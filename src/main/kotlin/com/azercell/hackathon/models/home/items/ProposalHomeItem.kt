package com.azercell.hackathon.models.home.items

import com.azercell.hackathon.models.home.HomeItem
import com.azercell.hackathon.models.proposal.Proposal

class ProposalHomeItem(
    id: Long?,
    title: String?,
    imageUrl: String?,
    upvotes: Int?,
    val companyTitle: String?
) : HomeItem(id, title, imageUrl, upvotes) {
    constructor(item: Proposal) : this(
        item.id, item.title, item.company?.imageUrl, item.upvotes, item.company?.title
    )
}