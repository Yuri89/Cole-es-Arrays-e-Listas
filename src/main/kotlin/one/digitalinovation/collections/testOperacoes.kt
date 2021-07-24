package one.digitalinovation.collections

fun main(){
    val salarios = doubleArrayOf(1000.0,5000.0,15000.0)

    for (salario in salarios){
        println(salario)
    }
    println("__________________")
    println("Maior salario = ${salarios.max()}")
    println("Menor salario = ${salarios.min()}")
    println("Media salarial = ${salarios.average()}")
    println("__________________")
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach {
        println(it)
    }
    println("__________________")
    println(salarios.count {it in 1000.0..5000.0})
    println(salarios.count {it in 1100.0..5000.0})
    println("__________________")
    println(salarios.find {it == 5000.0})
    println(salarios.find {it == 500.0})
    println("__________________")
    println(salarios.any {it == 1000.0})
    println(salarios.any {it == 500.0})




}