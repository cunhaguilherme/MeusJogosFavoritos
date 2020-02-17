    package br.com.guilhermecunha.meusjogosfavoritos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

    class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvJogos.adapter = JogosAdapter(carregaJogos(), this)
        rvJogos.layoutManager = LinearLayoutManager(this)
    }

    private fun carregaJogos(): List<Jogo>{
        return listOf(
            godOfWar(),
            godOfWar(),
            godOfWar()
        )
    }

    private fun godOfWar() : Jogo{
        return Jogo(
            R.drawable.godofwar,
            "God of War",
            2018,
            "Jogo toperson"
        )
    }
}
