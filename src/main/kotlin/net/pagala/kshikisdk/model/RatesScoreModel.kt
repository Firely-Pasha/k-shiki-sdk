package net.pagala.kshikisdk.model

import net.pagala.kshikisdk.interfaces.RatesScore

data class RatesScoreModel(
    override val name: Int,
    override val value: Int
) : RatesScore