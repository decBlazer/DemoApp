package com.varughese.myapplication

import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore

val db = FirebaseFirestore.getInstance()
val user = Data("Blaise", "Varughese","blaisevarughese@gmail.com")
fun set() {
    db.collection("users")
        .document("blaise_varughese")
        .set(user)
        .addOnSuccessListener {
            Log.d("Firestore", "User added")
        }
        .addOnFailureListener { e ->
            Log.w("Firestore", "Error adding user", e)
        }
}

fun get() {
    db.collection("users")
        .document("blaise_varughese")
        .get()
        .addOnSuccessListener { document ->
            if (document != null) {
                val userData = document.toObject(Data::class.java)
                Log.d("Firestore", "DocumentSnapshot data: ${userData}")
            } else {
                Log.d("Firestore", "No such document")
            }
        }
        .addOnFailureListener { e ->
            Log.w("Firestore", "Error getting document", e)
        }
}

fun main() {
    println(set())
    println(get())
}