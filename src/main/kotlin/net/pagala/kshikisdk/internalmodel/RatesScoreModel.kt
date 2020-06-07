package net.pagala.kshikisdk.internalmodel

import net.pagala.kshikisdk.model.RatesScore

internal data class RatesScoreModel(
    override val name: Int,
    override val value: Int
) : RatesScore