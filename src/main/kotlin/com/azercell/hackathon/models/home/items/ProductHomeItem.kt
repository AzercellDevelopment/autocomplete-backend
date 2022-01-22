package com.azercell.hackathon.models.home.items

import com.azercell.hackathon.models.home.HomeItem
import com.azercell.hackathon.models.product.Product

class ProductHomeItem(
    id: Long?,
    title: String?,
    imageUrl: String?,
    upvotes: Int?
) : HomeItem(id, title, imageUrl, upvotes) {
    constructor(item: Product) : this(item.id, item.title, item.imageUrl(), item.upvotes)
}