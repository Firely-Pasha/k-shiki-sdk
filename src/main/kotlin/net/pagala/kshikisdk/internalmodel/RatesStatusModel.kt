package net.pagala.kshikisdk.internalmodel

import net.pagala.kshikisdk.model.RatesStatus

internal data class RatesStatusModel(
    override val name: String,
    override val value: String
): RatesStatus