package com.example.tiktaktoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tiktaktoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    var turno= true
    val turno1 = "Es el turno del jugador 1"
    val turno2 = "Es el turno del jugador 2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {

            if (turno){
                binding.button1.text = "X"
                binding.button1.setBackgroundColor(Color.parseColor("#FF0000"))
                binding.button1.isEnabled = false
                turno = false
                //binding.mostrarTurno.text =
            }
            else if (!turno){
                binding.button1.text = "O"
                binding.button1.setBackgroundColor(Color.parseColor("#00FFFF"))
                binding.button1.isEnabled = false
                turno = true
            }

        }

        binding.newGame.setOnClickListener {

        }



    }
}