package com.github.galbanie.usermanagement.model.db

import org.jetbrains.exposed.sql.Table

/**
 * Created by Galbanie on 2017-07-15.
 */


object Addresses : Table("Addresses") {
    val id = integer("AddressId").primaryKey().autoIncrement()
    val streetNumber = varchar("StreetNumber",250)
    val streetName = varchar("StreetName",250)
    val city = varchar("City",250)
    val zipCode = varchar("ZipCode",250)
    val country = varchar("Country",250)
    val province = varchar("Province",250)
}