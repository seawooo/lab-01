package com.example.petshop

class Sad(date: String): Mood(date){
    override fun relay(): String {
        return "Sad"
    }
}