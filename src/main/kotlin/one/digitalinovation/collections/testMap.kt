package one.digitalinovation.collections

fun main(){
    val pair: Pair<String, Double> = Pair("joao",1000.0)
    val map = mapOf(pair)

    map.forEach{(t, v) -> println("chave = $t"+"\n"+"valor = $v")}
    println("---------------------------------------")

    val map2 = mapOf(
        "joao" to 1000.0,
        "maria" to 4000.0
    )
    map2.forEach{(k, v) -> println("chave = $k"+"\n"+"valor = $v")}
    println("---------------------------------------")
}