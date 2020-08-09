package net.pagala.shikimorisdk.internalmodel

import net.pagala.shikimorisdk.model.RatesStatus

internal data class RatesStatusModel(
    override val name: String,
    override val value: String
): RatesStatus