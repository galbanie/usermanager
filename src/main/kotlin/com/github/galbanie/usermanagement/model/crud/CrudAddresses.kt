package com.github.galbanie.usermanagement.model.crud

import com.github.galbanie.usermanagement.model.Address
import com.github.galbanie.usermanagement.model.db.Addresses
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.SchemaUtils

/**
 * Created by Galbanie on 2017-07-15.
 */
class CrudAddresses : CrudTable<Address> {
    override fun createTable() {
        SchemaUtils.create(Addresses)
    }

    override fun create(t: Address): Address {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(): Iterable<Address> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteAll(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(t: Address): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findBy(column: Column<*>, value: Any): Iterable<Address>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(t: Address) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findColumnName(): Iterable<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}