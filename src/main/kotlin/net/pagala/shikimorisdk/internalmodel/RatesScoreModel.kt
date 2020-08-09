package net.pagala.shikimorisdk.internalmodel

import net.pagala.shikimorisdk.model.RatesScore

internal data class RatesScoreModel(
    override val name: Int,
    override val value: Int
) : RatesScore