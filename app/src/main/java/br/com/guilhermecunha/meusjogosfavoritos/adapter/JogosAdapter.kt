package br.com.guilhermecunha.meusjogosfavoritos.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import br.com.guilhermecunha.meusjogosfavoritos.R
import br.com.guilhermecunha.meusjogosfavoritos.model.Jogo
import kotlinx.android.synthetic.main.jogo_item.view.*

class JogosAdapter(
    private val jogos: List<Jogo>,
    private val mContext: Context,
    val listener: (Jogo) -> Unit
) : RecyclerView.Adapter<JogosAdapter.JogoViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {
        val itemView = LayoutInflater.from(mContext).inflate(R.layout.jogo_item, parent)
        return JogoViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return jogos.size
    }

    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {
        holder.bindView(jogos[position], listener)
    }


    class JogoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindView(
            jogo: Jogo,
            listener: (Jogo) -> Unit
        ) = with(itemView){
            tvNome.text = jogo.titulo
            tvAnoLancamento.text = "Lançamento: ${jogo.anoLancamento}"
            tvDescricao.text = jogo.descricao

            ivJogo.setImageDrawable(ContextCompat.getDrawable(context, jogo.resourceId))

            setOnClickListener{ listener(jogo) }
        }


    }

}

