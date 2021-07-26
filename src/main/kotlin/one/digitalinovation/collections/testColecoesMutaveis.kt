package one.digitalinovation.collections

fun main(){
    val lucas = Funcionario("Lucas",4000.00,"CLT")
    val jonathan = Funcionario("Jonathan",1000.00,"PJ")
    val maria = Funcionario("Maria",2000.00,"PJ")
    println("------------------list-----------------")
    val funcionarios = mutableListOf(lucas,maria)
    funcionarios.forEach{println(it)}
    println("---------------------------------------")
    funcionarios.add(jonathan)
    funcionarios.forEach{println(it)}
    println("---------------------------------------")
    funcionarios.remove(lucas)
    funcionarios.forEach{println(it)}
    println("-------------------set-----------------")
    val funcionarioSet = mutableSetOf(lucas)

    funcionarioSet.add(jonathan)
    funcionarioSet.add(maria)

    funcionarioSet.forEach {println(it)}
    println("---------------------------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach {println(it)}

}