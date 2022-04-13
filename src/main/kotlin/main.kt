fun main() {
    var a =
        findEven(listOf("Nyakuar", "Gatwech", "Lona", "Rehal", "sab", "Nadien", "Cecilia", "Luciana", "Phiona", "Wanda"))
    println(a)
    var total = heightInmeters(listOf(5, 6, 2, 5))
    println(total)

    var Nyakuar=Person("Nyakuar",23,1.5,70)
    var Gatwech=Person("Gatwech",20,1.4,60)
    var Mollen=Person("Mollen",19,1.3,50)
    var Beryl=Person("Berly",18,1.2,40)

    var namesOfpeople= listOf(Nyakuar,)
    var descending=namesOfpeople.sortedByDescending {Person ->  Person.age}
    println(descending)

    var w=Person("Mommy",56,1.0,50)
    var q=Person("Mommy",56,7.2,60)
    var newList= mutableListOf(w,q)
    println (newList.plus(namesOfpeople))

    var Toyota=Cars("KCB107L",22)
    var Jeep=Cars("KDC108O",23)
    var Prado=Cars("KBC198K",21)
    var macedise =Cars("KCA345G",20)
    var Ranger= listOf(Toyota,Jeep,Prado ,macedise)
    println(car(macedise))

}
fun findEven(num:List<String>):List<String>{
    var y= mutableListOf<String>()
    num.forEachIndexed { index, i ->
        if(index %2 ==0){
            y.add(i)
        }

    }
    return y
}

fun heightInmeters(height:List<Int>):String{
    var f=height.sum()
    var g=height.average()
    var total ="$f,$g"
    return total

}

fun addPeople(twopeople:List<Any>):List<Any>{
    return listOf()
}
fun car(gari:List<Cars>):Int {
    var magari = 0
    gari.forEach { b -> b.mileage
        magari+=b.mileage
    }
    var total=magari/gari.count()
    return total
}

data class Person(var name:String, var age:Int,var height:Double,var weight:Int)


data class Cars(var registration:String,var mileage:Int)