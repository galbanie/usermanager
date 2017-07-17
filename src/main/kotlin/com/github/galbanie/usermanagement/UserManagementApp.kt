package com.github.galbanie.usermanagement

import com.github.galbanie.usermanagement.model.crud.CrudAddresses
import com.github.galbanie.usermanagement.model.crud.CrudUsers
import com.github.galbanie.usermanagement.view.UserManagementMasterView
import javafx.application.Application
import javafx.scene.Scene
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.transactions.transaction
import tornadofx.*

class UserManagementApp : App(UserManagementMasterView::class, Styles::class){

    init {
        Database.connect("jdbc:h2:file:./db/dbase;DB_CLOSE_DELAY=-1;IFEXISTS=TRUE",driver = "org.h2.Driver")
        transaction {
            CrudAddresses().createTable()
            CrudUsers().createTable()
        }
    }

    override fun createPrimaryScene(view: UIComponent) = Scene(view.root, 1024.0, 768.0)
}

/**
 * The main method is needed to support the mvn jfx:run goal.
 */
fun main(args: Array<String>) {
    Application.launch(UserManagementApp::class.java, *args)
}