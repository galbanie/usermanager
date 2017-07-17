package com.github.galbanie.usermanagement.model.db

import org.jetbrains.exposed.sql.Table

/**
 * Created by Galbanie on 2017-07-15.
 */
object UsersGroups : Table("UsersGroups") {
    val idUser = reference("IDUser",Users.id).primaryKey()
    val idGroup = reference("IDGroup",Groups.id).primaryKey()
}