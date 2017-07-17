package com.github.galbanie.usermanagement.model.db

import org.jetbrains.exposed.sql.Table

/**
 * Created by Galbanie on 2017-07-15.
 */
object Users : Table("Users") {
    val id = integer("IDUser").primaryKey().autoIncrement()
    val userName = varchar("UserName",250).uniqueIndex()
    val password = varchar("Password",250)
    val firstName = varchar("FirstName",250)
    val lastName = varchar("LastName",250)
    val phone = varchar("Phone",250)
    val email = varchar("Email",250)
    val addressId = reference("AddressId",Addresses.id)
}
