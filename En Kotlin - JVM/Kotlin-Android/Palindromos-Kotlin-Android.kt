package com.fixedtorres.laboratoriojellybean

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class ActividadCentral : AppCompatActivity() {

    fun esPalindromo(text: String): String {
        var (igual, aux) = Pair(0, text.length - 1)

        text.indices.forEach { ind ->
            if(text[ind].toLowerCase() == text[aux].toLowerCase()) {
                igual++
            }
            aux--
        }

        when (igual) {
            text.length -> {
                return "Es palindromo:\n" +
                       "------------------------------------------------\n" +
                       "Longitud del texto normal:     ${text.length}\n" +
                       "Longitud del texto inverso:    ${igual}"
            } else -> {
                return "No es palindromo:\n" +
                       "------------------------------------------------\n" +
                       "Longitud del texto normal:     ${text.length}\n" +
                       "Longitud del texto inverso:    ${igual}"
            }
        }
    }

    fun sendMessage(view: View) {
        val editText = findViewById<View>(R.id.editText) as EditText
        val resultText = findViewById<View>(R.id.resultText) as TextView
        val text = editText.text.toString()
        val msg: String = esPalindromo(text)

        resultText.text = msg
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_central)

        var autor = findViewById<View>(R.id.Autor) as TextView
        val datos: String = "Información sobre el autor:\n" +
            "--------------------------------------------------------\n" +
            "Alfonso Orjuela <Fixed Torres>\n" +
            "20 de Enero de 2018\n\n" +
            "https://misfragmentosdecodigo.eu"
        autor.text = datos
    }
}
