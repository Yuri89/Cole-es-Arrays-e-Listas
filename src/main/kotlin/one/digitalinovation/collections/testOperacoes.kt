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

}