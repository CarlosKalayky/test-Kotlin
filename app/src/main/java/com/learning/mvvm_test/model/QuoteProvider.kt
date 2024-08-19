package com.learning.mvvm_test.model

class QuoteProvider {
    companion object {

        fun random():QuoteModel{
            val position = (0..4).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel("Together Forever", "CZ 224"),
            QuoteModel("I miss you", "CKKT"),
            QuoteModel("Lets be together always", "CKKT"),
            QuoteModel("Badzmy razem na dobre i na zle", "ZKK"),
            QuoteModel("Together Forever", "CZ 224"),
        )
    }
}