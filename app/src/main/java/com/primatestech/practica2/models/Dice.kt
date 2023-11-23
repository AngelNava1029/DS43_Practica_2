package com.primatestech.practica2.models

import kotlin.random.Random
data class Dice(private val cara:Int) {
    fun roll():Int{
        return Random.nextInt(1,cara+1)
    }
}