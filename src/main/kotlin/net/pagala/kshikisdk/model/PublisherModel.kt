package net.pagala.kshikisdk.model

import net.pagala.kshikisdk.interfaces.Publisher

data class PublisherModel(
    override val id: Int,
    override val name: String
) : Publisher
