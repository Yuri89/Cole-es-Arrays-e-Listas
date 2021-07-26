package one.digitalinovation.collections

fun main(){
    val lucas = Funcionario("Lucas",4000.00,"CLT")
    val jonathan = Funcionario("Jonathan",1000.00,"PJ")
    val maria = Funcionario("Maria",2000.00,"PJ")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(maria.nome, maria)
    repositorio.create(jonathan.nome, jonathan)
    repositorio.create(lucas.nome, lucas)

    println(repositorio.findById(maria.nome))

    println("=======================================")

    repositorio.findAll().forEach{
        println(it)
    }
    println("=======================================")

    println(repositorio.remove(lucas.nome))

    println("=======================================")

    repositorio.findAll().forEach{
        println(it)
    }
}