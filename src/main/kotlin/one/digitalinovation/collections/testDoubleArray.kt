package one.digitalinovation.collections

fun main(){
    val salarios = DoubleArray(4)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 5000.0
    salarios[3] = 12000.0

    salarios.forEach {
        println(it)
    }

    println("_________________________")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach {
        println(it)
    }
    println("_________________________")

    val salarios2 = doubleArrayOf(100.0,500.0,1000.0)

    salarios2.forEach {
        println(it)
    }

}