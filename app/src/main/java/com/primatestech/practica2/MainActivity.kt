package com.primatestech.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import android.widget.Spinner
import com.primatestech.practica2.models.Dice

class MainActivity : AppCompatActivity() {

    private var dado:Int=0
    private var valorCaras: String = ""
    private  lateinit var total : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //numeros random de dados
        val numcaras=findViewById<EditText>(R.id.numcaras)
        val resultado=findViewById<TextView>(R.id.res)
        val botton=findViewById<Button>(R.id.boton)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val options = resources.getStringArray(R.array.convert_options)
        total = findViewById(R.id.res)

        botton.setOnClickListener{
            var numcarasText=numcaras.text.toString()
            if(numcarasText.isNotEmpty()){

                tirarDado(dado)
            }

        }

        //numero de caras de dados con un numero de dados seleccionado
        if (spinner != null) {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
            spinner.adapter = adapter
            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    dado = position
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }
        }
    }
    fun tirarDado(tirar:Int){
        val numcaras=findViewById<EditText>(R.id.numcaras)
        val numcarasText=numcaras.text.toString()
        val numcarasInt=numcarasText.toInt()
        val tirardado=Dice(numcarasInt)
        val resultado=findViewById<TextView>(R.id.res)
        val resultados = List(20) { tirardado.roll() }
        val Dado1=resultados[0].toString()
        val Dado2=resultados[1].toString()
        val Dado3=resultados[2].toString()
        val Dado4=resultados[3].toString()
        val Dado5=resultados[4].toString()
        val Dado6=resultados[5].toString()
        val Dado7=resultados[6].toString()
        val Dado8=resultados[7].toString()
        val Dado9=resultados[8].toString()
        val Dado10=resultados[9].toString()
        val Dado11=resultados[10].toString()
        val Dado12=resultados[11].toString()
        val Dado13=resultados[12].toString()
        val Dado14=resultados[13].toString()
        val Dado15=resultados[14].toString()
        val Dado16=resultados[15].toString()
        val Dado17=resultados[16].toString()
        val Dado18=resultados[17].toString()
        val Dado19=resultados[18].toString()
        val Dado20=resultados[19].toString()

        when(tirar){
            0 ->{
                //3 Caras
                resultado.text=(
                        "CaraDelDado 1="+Dado1+"\n"+
                        "CaraDelDado 2="+Dado2+"\n"+
                        "CaraDelDado 3="+Dado3)
            }
            1 ->{
                //6 Caras
                resultado.text=(
                        "CaraDelDado 1="+Dado1+"\n"+
                        "CaraDelDado 2="+Dado2+"\n"+
                        "CaraDelDado 3="+Dado3+"\n"+
                        "CaraDelDado 4="+Dado4+"\n"+
                        "CaraDelDado 5="+Dado5+"\n"+
                        "CaraDelDado 6="+Dado6)
            }
            2 ->{
                //9 Caras
                resultado.text=(
                        "CaraDelDado 1="+Dado1+"\n"+
                        "CaraDelDado 2="+Dado2+"\n"+
                        "CaraDelDado 3="+Dado3+"\n"+
                        "CaraDelDado 4="+Dado4+"\n"+
                        "CaraDelDado 5="+Dado5+"\n"+
                        "CaraDelDado 6="+Dado6+"\n"+
                        "CaraDelDado 7="+Dado7+"\n"+
                        "CaraDelDado 8="+Dado8+"\n"+
                        "CaraDelDado 9="+Dado9)
            }
            3 ->{
                //12 Caras
                resultado.text=(
                        "CaraDelDado 1="+Dado1+"\n"+
                        "CaraDelDado 2="+Dado2+"\n"+
                        "CaraDelDado 3="+Dado3+"\n"+
                        "CaraDelDado 4="+Dado4+"\n"+
                        "CaraDelDado 5="+Dado5+"\n"+
                        "CaraDelDado 6="+Dado6+"\n"+
                        "CaraDelDado 7="+Dado7+"\n"+
                        "CaraDelDado 8="+Dado8+"\n"+
                        "CaraDelDado 9="+Dado9+"\n"+
                        "CaraDelDado 10="+Dado10+"\n"+
                        "CaraDelDado 11="+Dado11+"\n"+
                        "CaraDelDado 12="+Dado12)
            }
            4 ->{
                //20 Caras
                resultado.text=(
                        "CaraDelDado 1="+Dado1+""+ "    "+
                        "CaraDelDado 2="+Dado2+""+"\n"+
                        "CaraDelDado 3="+Dado3+""+ "    "+
                        "CaraDelDado 4="+Dado4+""+"\n"+
                        "CaraDelDado 5="+Dado5+""+ "    "+
                        "CaraDelDado 6="+Dado6+""+" \n"+
                        "CaraDelDado 7="+Dado7+""+ "    "+
                        "CaraDelDado 8="+Dado8+""+"\n"+
                        "CaraDelDado 9="+Dado9+""+ "    "+
                        "CaraDelDado 10="+Dado10+""+"\n"+
                        "CaraDelDado 11="+Dado11+""+ "    "+
                        "CaraDelDado 12="+Dado12+""+"\n"+
                        "CaraDelDado 13="+Dado13+""+ "    "+
                        "CaraDelDado 14="+Dado14+""+"\n"+
                        "CaraDelDado 15="+Dado15+""+ "    "+
                        "CaraDelDado 16="+Dado16+""+"\n"+
                        "CaraDelDado 17="+Dado17+""+ "    "+
                        "CaraDelDado 18="+Dado18+""+"\n"+
                        "CaraDelDado 19="+Dado19+""+ "    "+
                        "CaraDelDado 20="+Dado20)
            }
        }
    }
}