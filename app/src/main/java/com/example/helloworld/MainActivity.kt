package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCalcular = btn
        val txtResultado = resultados

        btnCalcular.setOnClickListener {
            val numero1:Int = Integer.parseInt(nota1.text.toString())
            val numero2:Int = Integer.parseInt(nota2.text.toString())
            val media:Int = (numero1 + numero2) / 2
            val faltas:Int = Integer.parseInt(falta.text.toString())

            if (media >= 6 && faltas<=10){
                txtResultado.setText("Aluno foi aprovado:"+"\n"+"Nota final:"+media+"\n"+"faltas"+faltas)
                txtResultado.setTextColor(Color.GREEN)
            }
            else{
                txtResultado.setText("Aluno reprovado!!")
                txtResultado.setTextColor(Color.RED)
            }
        }

    }
}