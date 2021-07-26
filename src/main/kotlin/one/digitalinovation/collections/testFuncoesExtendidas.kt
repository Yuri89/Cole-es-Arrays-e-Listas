package one.digitalinovation.collections

fun main(){
    val salario = arrayOf(
        "4550.80".toBigDecimal(),
        "2060.55".toBigDecimal(),
        "7533.10".toBigDecimal(),
        "1011.88".toBigDecimal(),
        "5229.45".toBigDecimal(),
        "600.32".toBigDecimal()
    )
    println(salario.somatoria())
    println("===================================")
    println(salario.media())
}