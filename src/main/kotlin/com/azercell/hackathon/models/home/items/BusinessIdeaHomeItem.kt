package com.azercell.hackathon.models.home.items

import com.azercell.hackathon.models.home.HomeItem
import com.azercell.hackathon.models.idea.BusinessIdea

class BusinessIdeaHomeItem(
    id: Long?,
    title: String?,
    upvotes: Int?,
    val description: String?
) : HomeItem(id, title, null, upvotes) {
    constructor(item: BusinessIdea) : this(item.id, item.title, item.upvotes, item.description)
}