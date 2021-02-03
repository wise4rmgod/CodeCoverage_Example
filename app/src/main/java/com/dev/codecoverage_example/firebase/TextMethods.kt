package com.dev.codecoverage_example.firebase

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.dev.codecoverage_example.model.AkukoDataClass
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

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