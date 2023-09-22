package com.curso.android.app.myapplication.view

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.curso.android.app.myapplication.R
import com.curso.android.app.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var text1 = findViewById<TextView>(R.id.editTextText)
        var text2 = findViewById<TextView>(R.id.editTextText2)

        mainViewModel.comparador.observe(this) {
            println("EL ultimo resultado fue $it")
            binding.textView.text = "${it.resultado}"
            binding.ultimaActualizacion.text = "Actualizado el ${it.timestamp}"
        }

            binding.button.setOnClickListener {

                mainViewModel.comparadorDeStrings()
            }

    }
}