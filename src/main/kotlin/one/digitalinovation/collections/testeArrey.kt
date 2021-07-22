package one.digitalinovation.collections

fun main(){
     val value = IntArray(5)

    value [0] = 4
    value [1] = 7
    value [2] = 3
    value [3] = 1
    value [4] = 10
    println("___________________ ex 1")
    for (valor in value)
        println(valor)

    println("___________________ ex 2")
    value.forEach { valor ->
        println(valor)

    println("___________________ ex 3")
        for (index in value.indices){
           println(value[index])
    }
    println("___________________ ex 4")

    value.sort()
        for (valor in value)
            println(valor)
    }
}