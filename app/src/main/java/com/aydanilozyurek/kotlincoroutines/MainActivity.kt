package com.aydanilozyurek.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Global Scope
        /*  GlobalScope.launch {
            repeat(100000){
                launch {
                    println("android")
                }
            }
        }*/


        /*
        // runBlocking
        println("run blocking start")
        runBlocking {
            launch {
                delay(5000)
                println("run blocking")
            }
        }
        println("run blocking end")
*/

        //Coroutine Scope
        println("coroutine start")
        CoroutineScope( Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")
        }
        println("coroutine end")
    }

}