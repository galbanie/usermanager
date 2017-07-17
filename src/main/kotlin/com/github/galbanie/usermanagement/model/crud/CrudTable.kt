package com.github.galbanie.usermanagement.model.crud

import org.jetbrains.exposed.sql.Column

/**
 * Created by Galbanie on 2017-07-15.
 */
interface CrudTable<T> {
    fun createTable()
    fun create(t : T) : T
    fun findAll() : Iterable<T>
    fun deleteAll() : Int
    fun delete(t : T) : Int
    fun findBy(column : Column<*>, value : Any) : Iterable<T>?
    fun update(t : T)
    fun findColumnName() : Iterable<String>
}