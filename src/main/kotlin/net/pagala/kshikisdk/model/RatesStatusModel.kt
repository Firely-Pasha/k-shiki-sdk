package net.pagala.kshikisdk.model

import net.pagala.kshikisdk.interfaces.RatesStatus

data class RatesStatusModel(
    override val name: String,
    override val value: String
): RatesStatus