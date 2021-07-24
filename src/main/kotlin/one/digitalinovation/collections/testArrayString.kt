package one.digitalinovation.collections


fun main(){
    val nomes = Array(10){""}
    nomes[0] = "igor"
    nomes[1] = "betha"
    nomes[2] = "marley"
    nomes[3] = "noa"
    nomes[4] = "jimmy"
    nomes[5] = "cleiton"
    nomes[6] = "jurandir"
    nomes[7] = "claudia"
    nomes[8] = "renan"
    nomes[9] = "lurdes"

    for (nome in nomes){
        println(nome)
    }
    println("______________________________1")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("______________________________2")
    val nomes2 = arrayOf("lurdes","betha","jurandir")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }

}