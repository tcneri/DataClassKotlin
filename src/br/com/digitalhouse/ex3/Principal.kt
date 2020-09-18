package br.com.digitalhouse.ex3

fun main(){
    val aluno1 = Aluno("André", 1)
    val aluno2 = Aluno("Thalita", 2)
    val aluno3 = Aluno("João", 3)
    val aluno4 = Aluno("Junior", 4)
    val listaAluno = listOf(aluno1,aluno2,aluno3,aluno4)

    val alunoNovo = aluno4.copy("Maria")

    val aluno11 = Aluno1("André", 1)
    val aluno21 = Aluno1("Thalita", 2)
    val aluno31 = Aluno1("João", 3)
    val aluno41 = Aluno1("Junior", 4)
    val listaAluno1 = listOf(aluno11,aluno21,aluno31,aluno41)

    val alunoNovo1 = aluno41.copy("Maria")

    println("Sem override: ${listaAluno1.contains(alunoNovo1)}")
    println("Com override: ${listaAluno.contains(alunoNovo)}")


}
