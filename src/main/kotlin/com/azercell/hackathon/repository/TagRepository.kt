package com.azercell.hackathon.repository

import com.azercell.hackathon.models.common.Tag
import org.springframework.data.repository.CrudRepository

interface TagRepository: CrudRepository<Tag, Long>