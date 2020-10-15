package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    // se declaran las dos variables que se va a comenzar a utilizar
    lateinit var edNum1Txt: EditText
    lateinit var edNum2Txt: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        edNum1Txt = findViewById(R.id.ednum1)
        edNum2Txt = findViewById(R.id.ednum2)



    }


    fun hacerOperacion(view: View)
    {
        //con estos log se mandan mensajes para que no los vea el usuario pero comprobar que la app hace algo

       // Log.e("CALCULADORAAPP","Se presionó el botón")
        //Log.d("CALCULADORAAPP","Se presionó el botón")

        val num1: Int = edNum1Txt.text.toString().toInt()
        val num2: Int = edNum2Txt.text.toString().toInt()
        val suma = num1 + num2
       //Toast.makeText(this, "El resultado es: $suma", Toast.LENGTH_LONG).show()
        //val text: TextView = findViewById(R.id.textView6) as TextView
        val textView = findViewById<TextView>(R.id.textView6)
        textView.text = suma.toString()
        val textViewString = textView.text.toString()


    }
    fun hacerResta(view: View)
    {
        val num1: Int = edNum1Txt.text.toString().toInt()
        val num2: Int = edNum2Txt.text.toString().toInt()
        val resta = num1 - num2
        val textoresult: TextView = findViewById<TextView>(R.id.textView6)
        //Toast.makeText(this, "El resultado es: $resta", Toast.LENGTH_LONG).show()
        val textView = findViewById<TextView>(R.id.textView6)
        textView.text= resta.toString()
        // Inicializo el valor del textView, que haga una busqueda y lo coloque en el TextView6
        //despues se le agrega el valor y se le convierte a cadena.


    }
    fun hacerDivision(view: View)
    {
        val num1: Float = edNum1Txt.text.toString().toFloat()
        val num2: Float = edNum2Txt.text.toString().toFloat()
        val division = num1 / num2
       // Toast.makeText(this, "El resultado es: $division", Toast.LENGTH_LONG).show()
        val textView = findViewById<TextView>(R.id.textView6)
        textView.text= division.toString()

    }
    fun hacerMulti(view: View)
    {
        val num1: Int = edNum1Txt.text.toString().toInt()
        val num2: Int = edNum2Txt.text.toString().toInt()
        val multi = num1 * num2
        //Toast.makeText(this, "El resultado es: $multi", Toast.LENGTH_LONG).show()
        val textView= findViewById<TextView>(R.id.textView6)
        textView.text = multi.toString()

    }


}