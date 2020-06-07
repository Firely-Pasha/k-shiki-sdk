package net.pagala.kshikisdk.internalmodel

import net.pagala.kshikisdk.model.Publisher

internal data class PublisherModel(
    override val id: Int,
    override val name: String
) : Publisher
