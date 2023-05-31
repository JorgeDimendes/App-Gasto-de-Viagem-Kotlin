package com.jordev.gastoviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jordev.gastoviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //projeto teste 01
        //projeto teste 01

    }
    fun calculate(){
    }
}

    // Esse é um novo comentario da git checkout comentario_Animes
    //Novo comentario para deixar atualizado 10:40
    //Novo teste para subir 10:51
    //Novo teste para subir 10:55