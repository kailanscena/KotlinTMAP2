package br.com.ulbra.jogos.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.ulbra.jogos.R
import br.com.ulbra.jogos.model.Jogo

class JogoAdapter(private val onDeleteClick: (Jogo) -> Unit) :
    ListAdapter<Jogo, JogoAdapter.JogoViewHolder>(JogoDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.jogo_item, parent, false)
        return JogoViewHolder(view, onDeleteClick)
    }

    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class JogoViewHolder(itemView: View, private val onDeleteClick: (Jogo) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        private val tvNome: TextView = itemView.findViewById(R.id.tvNome)
        private val tvInfo: TextView = itemView.findViewById(R.id.tvInfo)
        private val tvDescricao: TextView = itemView.findViewById(R.id.tvDescricao)
        private val btnExcluir: Button = itemView.findViewById(R.id.btnExcluir)

        fun bind(jogo: Jogo) {
            tvNome.text = jogo.nome
            tvInfo.text = "${jogo.plataforma} - ${jogo.genero}"
            tvDescricao.text = jogo.descricao
            btnExcluir.setOnClickListener { onDeleteClick(jogo) }
        }
    }
}

class JogoDiffCallback : DiffUtil.ItemCallback<Jogo>() {
    override fun areItemsTheSame(oldItem: Jogo, newItem: Jogo) = oldItem.id == newItem.id
    override fun areContentsTheSame(oldItem: Jogo, newItem: Jogo) = oldItem == newItem
}