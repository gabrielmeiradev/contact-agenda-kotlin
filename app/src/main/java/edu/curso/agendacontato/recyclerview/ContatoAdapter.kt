package edu.curso.agendacontato.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.curso.agendacontato.R
import edu.curso.agendacontato.model.Contato

class ContatoAdapter(val context : Context, val list : List<Contato>) : RecyclerView.Adapter<ContatoViewHolder>() {
    lateinit var inflater : LayoutInflater;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {
        inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.contato_item_layout, parent, false);
        return ContatoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int) {
        val contato = list[position]
        holder.txtNome.text = contato.nome;
        holder.txtEmail.text = contato.email;
        holder.txtTelefone.text = contato.telefone;
    }

    override fun getItemCount(): Int {
        return list.size;
    }
}