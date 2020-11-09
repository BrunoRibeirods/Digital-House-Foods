package com.desafio.digitalhousefoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.desafio.digitalhousefoods.domain.Restaurante
import com.desafio.digitalhousefoods.domain.RestauranteAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private val listaDeRestaurantes = getRestaurantes(3)
    private val adapter = RestauranteAdapter(listaDeRestaurantes)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvRestaurantes.adapter = adapter
        rvRestaurantes.setHasFixedSize(true)

    }

    fun getRestaurantes(size: Int): ArrayList<Restaurante>{
        val lista = ArrayList<Restaurante>()

        for (i in 0..size){
            when(i%4){
                0 -> lista.add(Restaurante(R.drawable.image1, "Tony Roma's", "Avenida Lavandisca, 717 - Indianópolis, São Paulo", "Fecha ás 22:00"))
                1 -> lista.add(Restaurante(R.drawable.image4, "Aoyama - Moema", "Alameda Dos Arapanés, 532 - Moema", "Fecha ás 00:00"))
                2 -> lista.add(Restaurante(R.drawable.image5, "Outback - Moema", "Av. Moaci, 187 - Moema, São Paulo", "Fecha ás 00:00"))
                3 -> lista.add(Restaurante(R.drawable.image3, "Sí Senõr!", "Alameda juaperi, 626 - Moema", "Fecha ás 01:00"))
            }
        }

        return lista
    }
}