package net.pagala.kshikisdk.service

import net.pagala.kshikisdk.filters.search.TitleSearchFilter
import net.pagala.kshikisdk.interfaces.Relation
import net.pagala.kshikisdk.interfaces.Role
import net.pagala.kshikisdk.interfaces.Title
import net.pagala.kshikisdk.interfaces.TitleInfo

interface TitleService {

    fun get(titleId: Int): TitleInfo

    fun getList(): List<Title>

    fun getList(titleSearchFilter: TitleSearchFilter): List<Title>

    fun getRoles(titleId: Int): List<Role>

    fun getSimilar(titleId: Int): List<Title>

    fun getRelated(titleId: Int): List<Relation>
}