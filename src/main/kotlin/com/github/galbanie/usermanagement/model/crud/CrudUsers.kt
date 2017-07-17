package com.github.galbanie.usermanagement.model.crud

import com.github.galbanie.usermanagement.model.User
import com.github.galbanie.usermanagement.model.db.Users
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.SchemaUtils

/**
 * Created by Galbanie on 2017-07-15.
 */
class CrudUsers : CrudTable<User> {
    override fun createTable() {
        SchemaUtils.create(Users)
    }

    override fun create(t: User): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(): Iterable<User> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteAll(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(t: User): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findBy(column: Column<*>, value: Any): Iterable<User>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(t: User) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findColumnName(): Iterable<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}