//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    println("========================1==========================")
    val array = arrayListOf(2, 8, 0, 9, 4, 3)
    println(array.first())
    println(array[0])
    println("========================2==========================")
//2
    var sum = 0
    for (i in array) sum += i
    println(sum / array.size)
    println(array.average())
    println("========================3==========================")
//3
    sum = 0
    array.forEach { i -> sum += i }
    println(sum)
    println(array.sum())
    println("========================4==========================")
//4
    var count = 0
    array.forEach { i -> count++ }
    println(count)
    println(array.count())
    println("========================5==========================")
//5
    for (i in array.indices){
        if (i == array.size - 2 || i == array.size - 1) print("${array[i]} ")
    }
    println()
    println(array.takeLast(2))
    println("========================6==========================")
//6
    sum = 0
    for (i in array.indices) sum += i
    println(sum)
    println(array.indices.sum())
}