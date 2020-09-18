package br.com.digitalhouse.ex2

fun main(){
    val coca1 = Coca(1,3.9)
    val coca2 = Coca(1,5.5)

    val coca11 = Coca1(1,3.9)
    val coca21 = Coca1(1,5.5)

    println("Sem override equals: ")
    println(coca11.equals(coca21))
    println("Com override equals: ")
    println(coca1.equals(coca2))
}