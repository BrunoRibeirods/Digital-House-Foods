package com.desafio.digitalhousefoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.desafio.digitalhousefoods.domain.Restaurante
import com.desafio.digitalhousefoods.domain.RestauranteAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private val listaDeRestaurantes = getRestaurantes()
    private val adapter = RestauranteAdapter(listaDeRestaurantes)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvRestaurantes.adapter = adapter
        rvRestaurantes.setHasFixedSize(true)


    }

    fun getRestaurantes(): ArrayList<Restaurante>{
        val lista = ArrayList<Restaurante>()

        lista.add(Restaurante(R.drawable.image1, "Tony Roma's", "Avenida Lavandisca, 717 - Indianópolis, São Paulo", "Fecha ás 22:00"))
        lista.add(Restaurante(R.drawable.image3, "Aoyama - Moema", "Alameda Dos Arapanés, 532 - Moema", "Fecha ás 00:00"))

        lista.add(Restaurante(R.drawable.image1, "Tony Roma's", "Avenida Lavandisca, 717 - Indianópolis, São Paulo", "Fecha ás 22:00"))
        lista.add(Restaurante(R.drawable.image3, "Aoyama - Moema", "Alameda Dos Arapanés, 532 - Moema", "Fecha ás 00:00"))

        lista.add(Restaurante(R.drawable.image1, "Tony Roma's", "Avenida Lavandisca, 717 - Indianópolis, São Paulo", "Fecha ás 22:00"))
        lista.add(Restaurante(R.drawable.image3, "Aoyama - Moema", "Alameda Dos Arapanés, 532 - Moema", "Fecha ás 00:00"))


        return lista
    }
}