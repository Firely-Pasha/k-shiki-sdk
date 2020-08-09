package net.pagala.shikimorisdk.internalmodel

import net.pagala.shikimorisdk.model.Publisher

internal data class PublisherModel(
    override val id: Int,
    override val name: String
) : Publisher
