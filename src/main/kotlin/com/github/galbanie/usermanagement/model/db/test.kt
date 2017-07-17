package com.github.galbanie.usermanagement.model.db

import com.github.galbanie.usermanagement.model.crud.CrudAddresses
import com.github.galbanie.usermanagement.model.crud.CrudUsers
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

/**
 * Created by Galbanie on 2017-07-15.
 */

fun main(args: Array<String>) {
    Database.connect("jdbc:h2:file:./db/dbase;DB_CLOSE_DELAY=-1;IFEXISTS=TRUE",driver = "org.h2.Driver")
    transaction {
        SchemaUtils.create(Addresses, Users)

        val idAddress = Addresses.insert {
            it[streetNumber] = "1234"
            it[streetName] = "neige"
            it[city] = "mtl"
            it[zipCode] = "4gt54i"
            it[country] = "ca"
            it[province] = "qc"
        } get Addresses.id

        Users.insert {
            it[userName] = "nizar"
            it[password] = "niz"
            it[firstName] = "Nizaro"
            it[lastName] = "bijou"
            it[phone] = "5147896324"
            it[email] = "ae.com"
            it[addressId] = idAddress
        }

        Users.selectAll().forEach {
            println(it)
        }

    }
}