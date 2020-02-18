    package br.com.guilhermecunha.meusjogosfavoritos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.guilhermecunha.meusjogosfavoritos.adapter.JogosAdapter
import br.com.guilhermecunha.meusjogosfavoritos.model.Jogo
import kotlinx.android.synthetic.main.activity_main.*

    class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvJogos.adapter = JogosAdapter(carregaJogos(), this){
            Toast.makeText(this, it.titulo, Toast.LENGTH_LONG).show()
        }
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

        private fun formulaOne() : Jogo{
            return Jogo(
                R.drawable.formulaOne,
                "Formula One 2019",
                2019,
                "Jogo sensacional"
            )
        }

        private fun callOfDuty() : Jogo{
            return Jogo(
                R.drawable.callofduty,
                "Call Of Duty",
                2019,
                "Jogo de tiro"
            )
        }
}
