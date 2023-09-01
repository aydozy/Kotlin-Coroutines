package com.aydanilozyurek.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    //Dispatchers
    //Dispatchers.Default --> CPU Intensive
    //Dispatchers.IO --> Input / Output, Networking
    //Dispatchers.Main --> UI
    //Dispatchers.Unconfiend --> Inherited dispatcher

    runBlocking {
        launch(Dispatchers.Main) {
            println("Main Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Unconfined) {
            println("Unconfiend Thread: ${Thread.currentThread().name}")
        }
    }
}