package net.pagala.kshikisdk.repository

import net.pagala.kshikisdk.interfaces.Relation
import net.pagala.kshikisdk.interfaces.Role
import net.pagala.kshikisdk.interfaces.Title
import net.pagala.kshikisdk.interfaces.TitleInfo

interface TitleRepository {

    fun get(id: Int): TitleInfo

    fun getList(): List<Title>

    fun getList(fields: Map<String, String>): List<Title>

    fun getRoles(id: Int): List<Role>

    fun getSimilar(id: Int): List<Title>

    fun getRelated(id: Int): List<Relation>

}