package one.digitalinovation.collections

import kotlin.math.min

fun main(){
    val lucas = Funcionario("Lucas",4000.00,"CLT")
    val jonathan = Funcionario("Jonathan",1000.00,"PJ")
    val maria = Funcionario("Maria",2000.00,"PJ")

    val funcionarios = listOf(lucas, jonathan, maria)

    funcionarios.forEach{println(it)}
    println("|||||||||||||||||||||||||||||||")
    println(funcionarios.find { it.nome == "Jonathan"})
    println("|||||||||||||||||||||||||||||||")
    funcionarios
        .sortedBy {it.salario}
        .forEach{ println(it)}
    println("|||||||||||||||||||||||||||||||")
    funcionarios
        .groupBy {it.tipoContatacao}
        .forEach{ println(it)}

}
data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContatacao: String,
){
    override fun toString(): String {
        return """
        Nome:    $nome
        Salario: $salario 
        """.trimIndent()
    }
}
