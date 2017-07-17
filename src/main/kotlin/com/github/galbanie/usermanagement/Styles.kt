package com.github.galbanie.usermanagement

import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import javafx.scene.text.TextAlignment
import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.cssclass
import tornadofx.px

class Styles : Stylesheet() {
    companion object {
        val heading by cssclass()
        val controlMenu by cssclass()
    }

    init {
        label and heading {
            padding = box(10.px)
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
        }

        controlMenu{
            padding = box(10.px)
            button{
                backgroundColor += Color.TRANSPARENT
                textAlignment = TextAlignment.LEFT

                and(hover){
                    backgroundColor += Color.LIGHTSLATEGRAY
                    textFill = Color.WHITE
                }
            }
        }
    }
}