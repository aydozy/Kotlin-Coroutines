package com.aydanilozyurek.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    var userName = ""
    var userAge = 0

    runBlocking {
       /* launch {
            val downName = downloadName()
            println("${downName}")
        }
        launch {
            val downAge = downloadAge()
            println("${downAge}")
        }*/

        val downName = async {
            downloadName()
        }

        val downAge= async {
            downloadAge()
        }

        userName = downName.await()
        userAge = downAge.await()

        println("${userName} ${userAge}")
    }

}

 suspend fun downloadName() : String{
    delay(2000)
     val userName = "Ayda: "
     println("username download")
     return userName
}

suspend fun downloadAge() :  Int {
    delay(4000)
    val age = 24
    println("userage download")
    return age
}