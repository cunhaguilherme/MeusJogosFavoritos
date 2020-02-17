package br.com.guilhermecunha.meusjogosfavoritos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class JogosAdapter(
    private val jogos: List<Jogo>,
    private val mContext: Context
) : RecyclerView.Adapter<JogosAdapter.JogoViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {
        val itemView = LayoutInflater.from(mContext).inflate(R.layout.jogo_item, parent)
        return JogoViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return jogos.size
    }

    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {
        holder.bindView(jogos[position])
    }


    class JogoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindView(jogo: Jogo) = with(itemView){
            tvNome.text = jogo.nome
            tvAnoLancamento.text = "Lançamento: ${jogo.anoLancamento}"
            tvDescricao.text = jogo.descricao

            ivJogo.setImageDrawable(ContextCompat.getDrawable(context, jogo.resourceId))
        }
    }

}

