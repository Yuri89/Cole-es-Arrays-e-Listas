package one.digitalinovation.collections

fun main(){
    val lucas = Funcionario("Lucas",4000.00,"CLT")
    val jonathan = Funcionario("Jonathan",1000.00,"PJ")
    val maria = Funcionario("Maria",2000.00,"PJ")

    val funcionario1 = setOf(lucas,jonathan)
    val funcionario2 = setOf(maria)

    val funcionarioUnion = funcionario1.union(funcionario2)

    funcionarioUnion.forEach{ println(it)}
    println("--------------------------------1")
    val funcionario3 = setOf(lucas,jonathan,maria)
    val funcionarioSub = funcionario3.subtract(funcionario2)

    funcionarioSub.forEach{ println(it)}
    println("--------------------------------2")
    val funcionarioAdd = funcionario3.intersect(funcionario2)
    funcionarioAdd.forEach{ println(it)}

}