package br.com.digitalhouse.ex1

data class Pessoa(var nome: String, var RG: Int) {


    override fun equals(other: Any?): Boolean {
        if (other == RG) return true
        else return true
    }
}