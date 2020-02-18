package br.com.guilhermecunha.meusjogosfavoritos.model

data class Jogo(val resourceId: Int,
                val titulo: String,
                var anoLancamento: Int,
                val descricao: String)