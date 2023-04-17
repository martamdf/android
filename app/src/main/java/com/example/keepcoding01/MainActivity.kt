package com.example.keepcoding01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Esto es un log")
        Log.v("MiTAG", "Este es un log con v mensaje")
        Log.d("MiTAG", "Este es un log con v mensaje")
        Log.i("MiTAG", "Este es un log de info!") // Se usaría para información
        Log.w("MiTAG", "Este es un log de warning") // Se usaría para warning
        Log.e("MiTAG", "Este es un log de error")
    }
}