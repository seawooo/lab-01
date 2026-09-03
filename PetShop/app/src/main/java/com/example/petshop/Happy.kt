package com.example.petshop

class Happy(date: String): Mood(date){
    override fun relay(): String {
        return "Happy"
    }
}