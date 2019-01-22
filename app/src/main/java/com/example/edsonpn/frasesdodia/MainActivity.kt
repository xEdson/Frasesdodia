package com.example.edsonpn.frasesdodia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {


   lateinit var texto : TextView
    val frases = arrayOf("Prefiro perder a guerra e ganhar a paz",
            "O que você tem todo mundo pode ter, mas o que você é, ninguém pode ser",
            "Somos feitos de carne, mas temos de viver como se fôssemos de ferro",
            "Muitas vezes o que se cala faz maior impacto do que o que se diz",
            "O melhor amigo da vida é o tempo, ele diz a verdade",
            "A vida é cheia de tentativas, então levante e diga: eu vou tentar e eu vou conseguir",
            "Certos momentos só podem ser apreciados quando você tira o pé do acelerador")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texto=findViewById(R.id.textoFrase ) as TextView
    }


    fun gerarFrase( view : View){

        val totalItensArray=frases.size
        val numeroAleatorio=Random().nextInt(totalItensArray)
        texto.setText(frases[numeroAleatorio])

    }
}
