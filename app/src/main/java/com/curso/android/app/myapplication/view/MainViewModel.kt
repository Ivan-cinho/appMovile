package com.curso.android.app.myapplication.view

import android.widget.EditText
import android.widget.TextView
import com.curso.android.app.myapplication.view.MainActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.Date
import com.curso.android.app.myapplication.modelo.Comparador


class MainViewModel: ViewModel() {
    val comparador: LiveData<Comparador> get() = _comparador
    private var _comparador = MutableLiveData<Comparador>(Comparador("", Date()))

//    var string1 = findViewById<TextView>(R.id.editTextText)

    fun comparadorDeStrings(string1: String, string2: String) {
//        val string2 = toString().lowercase()
//        val string1 = toString().lowercase()

        if(string1 == string2) {
            _comparador.value = Comparador("Los strings son iguales", Date())
        } else {
            _comparador.value = Comparador("Los strings no son iguales", Date())
        }
//        actualizarComparador()
    }
}
