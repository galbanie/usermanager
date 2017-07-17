package com.github.galbanie.usermanagement.view

import com.github.galbanie.usermanagement.Styles
import com.github.galbanie.usermanagement.view.fragment.DisplayUserFragment
import javafx.scene.layout.BorderPane
import javafx.scene.text.Font
import tornadofx.*

class UserManagementMasterView : View("User Management") {

    override val root = borderpane {
        left {
            vbox {
                addClass(Styles.controlMenu)
                button("Display Users") {
                    useMaxWidth = true
                    action {
                        center(DisplayUserFragment::class)
                    }
                }
                button("New User") {
                    useMaxWidth = true
                    action {
                        center(DisplayUserFragment::class)
                    }
                }
            }
        }
        center(DisplayUserFragment::class)
    }

}