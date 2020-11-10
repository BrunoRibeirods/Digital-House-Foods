package com.desafio.digitalhousefoods

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.desafio.digitalhousefoods.domain.Pratos
import com.desafio.digitalhousefoods.domain.PratosAdapter
import com.desafio.digitalhousefoods.domain.Restaurante
import com.desafio.digitalhousefoods.domain.RestauranteAdapter
import kotlinx.android.synthetic.main.fragment_restaurante.*
import kotlinx.android.synthetic.main.fragment_restaurante.view.*
import java.util.ArrayList


class RestauranteFragment : Fragment() {
    private val listaDePratos = getPratos(9)
    private val adapter: PratosAdapter = PratosAdapter(listaDePratos)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_restaurante, container, false)
        arguments?.getInt("amount")?.let {
            view.imgPrincipal.setImageResource(it)
        }

        arguments?.getString("nome")?.let {
            view.tv_nome_restaurante_card.text = it
        }


        val recy = view.findViewById<RecyclerView>(R.id.rvPratos)
        recy.adapter = adapter
        recy.layoutManager = GridLayoutManager(context, 2)
        recy.setHasFixedSize(true)

        view.btn_voltar.setOnClickListener {
            findNavController().navigate(R.id.action_restauranteFragment_to_mainFragment)
        }
        return view
    }

    companion object{
        fun newInstance() = RestauranteFragment()
    }

    fun getPratos(size: Int): ArrayList<Pratos> {
        val lista = ArrayList<Pratos>()

            for (i in 0..size) {
                when (i % 2) {
                    0 -> lista.add(Pratos("Salada com molho gengibre", R.drawable.image4))
                    1 -> lista.add(Pratos("Salada com molho gengibre", R.drawable.image4))
                }
            }


        return lista
    }

}