package net.pagala.shikimorisdk.service

import net.pagala.shikimorisdk.filters.search.CollectionParameter

internal fun <T> CollectionParameter<T>.build() = StringBuilder().apply {
    if (include.isNotEmpty()) {
        append(include.joinToString(separator = ",") { t -> t.toString() })
    }
    if (exclude.isNotEmpty()) {
        if (include.isNotEmpty()) {
            append(',')
        }
        append(exclude.joinToString(separator = ",") { t -> "!${t.toString()    }" })
    }
}.toString()
