package com.dev.codecoverage_example.util


object TextMethods {


    fun counttext(title: String, description: String): Int {
        val ty = title + description

        return ty.length
    }

    fun capitalizeText(title: String, description: String): String {
        val ty = title + description
        return ty.toUpperCase()
    }


}