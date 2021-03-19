import java.util.*
fun main(){
   cities()
    years()
    num()
    println(Arrays.toString(names()))

}
fun years(){
    var year=arrayOf("January","March","June","July")

    println(Arrays.toString(year.sortedArray()))
}

fun cities(){
    var city=arrayOf("harare","mumbai","dodoma","jakarta")
    city.forEach{cities->
        println(cities.capitalize())

    }
}
fun num(){
    var numbers=arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var x=numbers[1]
    var y=numbers[4]
    var result=x+y
    println(result)

    var index=numbers.indexOf(158)
    println(index)

   // var numbers=arrayOf(32,17,4,213,78,43,90,31,73,11,158,62)
    var sortedNumbers=numbers.sortedArray()
    println(Arrays.toString(sortedNumbers))
}
fun names(): Array<String>{
    var name=arrayOf("Jane","Eunice","Sandra")
    return  name

}