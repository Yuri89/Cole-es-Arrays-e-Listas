package one.digitalinovation.collections
 fun main(){

     val value = intArrayOf(1 ,2 ,3 ,4 ,5 ,6 ,10)

     value.forEach {
         println(it)
     }

     println("_______________________")

     value.sort()
     value.forEach {
         println(it)
     }


 }