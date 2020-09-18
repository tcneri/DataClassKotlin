package br.com.digitalhouse.ex1

fun main(){
    val pessoa1 = Pessoa("João S", 1114455887)
    val pessoa2 = Pessoa("Maria S",1114455887)

    val pessoa11 = Pessoa1("João S", 1114455887)
    val pessoa21 = Pessoa1("Maria S",1114455887)

    println("Sem override equals: ")
    println(pessoa11.equals(pessoa21))
    println("Com override equals: ")
    println(pessoa1.equals(pessoa2))
}