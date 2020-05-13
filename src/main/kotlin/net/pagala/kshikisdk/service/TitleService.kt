package net.pagala.kshikisdk.service

import net.pagala.kshikisdk.filters.search.TitleSearchFilter
import net.pagala.kshikisdk.repository.TitleRepository

abstract class TitleService {

    protected abstract val titleRepository: TitleRepository

    open fun get(titleId: Int) = titleRepository.get(titleId)

    open fun getList() = titleRepository.getList()

    open fun getList(titleSearchFilter: TitleSearchFilter) = titleRepository.getList(titleSearchFilter.build())

    open fun getRoles(titleId: Int) = titleRepository.getRoles(titleId)

    open fun getSimilar(titleId: Int) = titleRepository.getSimilar(titleId)

    open fun getRelated(titleId: Int) = titleRepository.getRelated(titleId)
}