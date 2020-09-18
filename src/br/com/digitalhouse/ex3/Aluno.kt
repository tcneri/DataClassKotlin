package br.com.digitalhouse.ex3

data class Aluno(var nome: String, var numeroDeAluno: Int) {

    override fun equals(other: Any?): Boolean {
        return other == numeroDeAluno
    }
}