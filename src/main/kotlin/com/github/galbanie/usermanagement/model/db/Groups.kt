package com.github.galbanie.usermanagement.model.db

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.groupConcat

/**
 * Created by Galbanie on 2017-07-15.
 */
object Groups : Table("Groups") {
    val id = integer("IDGroup").primaryKey()
    val name = varchar("Name", 250).uniqueIndex()
    val description = varchar("Name", 250)
}