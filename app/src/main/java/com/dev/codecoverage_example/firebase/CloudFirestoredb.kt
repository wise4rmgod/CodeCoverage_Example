package com.dev.codecoverage_example.firebase

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.dev.codecoverage_example.model.AkukoDataClass
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

object CloudFirestoredb {

    val db = Firebase.firestore


    fun save(context: Context, title: String, description: String, category: String, date: String) {

        val data = hashMapOf(
            "title" to title,
            "description" to description,
            "category" to category,
            "date" to date
        )
        // Add a new document with a generated ID
        db.collection("users")
            .add(data)
            .addOnSuccessListener { documentReference ->
                Toast.makeText(context, "Successfully", Toast.LENGTH_SHORT).show()
                Log.d("TAG", "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w("TAG", "Error adding document", e)
                Toast.makeText(context, "Not Successfully", Toast.LENGTH_SHORT).show()
            }
    }


    val usersDetails = MutableLiveData<List<AkukoDataClass>>()
    fun retrieve(): ArrayList<AkukoDataClass> {
        val users: ArrayList<AkukoDataClass> = ArrayList<AkukoDataClass>()
        db.collection("users")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    users.add(
                        AkukoDataClass(
                            document.data.getValue("title").toString(),
                            document.data.getValue("description").toString(),
                            document.data.getValue("category").toString(),
                            document.data.getValue("date").toString(),
                        )
                    )

                    usersDetails.value = users
                }
            }
            .addOnFailureListener { exception ->
                Log.w("TAG", "Error getting documents.", exception)
            }

        return users
    }


}