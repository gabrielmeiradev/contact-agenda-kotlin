package edu.curso.agendacontato.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.curso.agendacontato.R
import edu.curso.agendacontato.model.Contato
import edu.curso.agendacontato.recyclerview.ContatoAdapter

class ContatoListaActivity : Activity() {
    val lista = ArrayList<Contato>()
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle);
        setContentView(R.layout.contato_list_activity)

        lista.add(Contato("Joao Silva", "joao@teste.com", "(11) 1111"))
        lista.add(Contato("Gabriel Meira", "gabriel@teste.com", "(11) 2222"))
        lista.add(Contato("Henrique Manuel", "henrique@teste.com", "(11) 3333"))
        lista.add(Contato("Joao Silva", "joao@teste.com", "(11) 1111"))
        lista.add(Contato("Gabriel Meira", "gabriel@teste.com", "(11) 2222"))
        lista.add(Contato("Henrique Manuel", "henrique@teste.com", "(11) 3333"))
        lista.add(Contato("Joao Silva", "joao@teste.com", "(11) 1111"))
        lista.add(Contato("Gabriel Meira", "gabriel@teste.com", "(11) 2222"))
        lista.add(Contato("Henrique Manuel", "henrique@teste.com", "(11) 3333"))
        lista.add(Contato("Joao Silva", "joao@teste.com", "(11) 1111"))
        lista.add(Contato("Gabriel Meira", "gabriel@teste.com", "(11) 2222"))
        lista.add(Contato("Henrique Manuel", "henrique@teste.com", "(11) 3333"))
        lista.add(Contato("Joao Silva", "joao@teste.com", "(11) 1111"))
        lista.add(Contato("Gabriel Meira", "gabriel@teste.com", "(11) 2222"))
        lista.add(Contato("Henrique Manuel", "henrique@teste.com", "(11) 3333"))
        lista.add(Contato("Joao Silva", "joao@teste.com", "(11) 1111"))
        lista.add(Contato("Gabriel Meira", "gabriel@teste.com", "(11) 2222"))
        lista.add(Contato("Henrique Manuel", "henrique@teste.com", "(11) 3333"))


        val adapter = ContatoAdapter(this, lista);
        val recycler = findViewById<RecyclerView>(R.id.rcv_contato_lista);
        recycler.adapter = adapter;
        recycler.layoutManager = LinearLayoutManager(this);
    }
}