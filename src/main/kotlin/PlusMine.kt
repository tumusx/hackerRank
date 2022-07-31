import java.text.DecimalFormat

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var zero: Double = 0.0
    var positive: Double = 0.0
    var negative: Double = 0.0
    for(i in arr){
        if(i == 0){
            zero++
        }else if(i > 0){
            positive++
        }else if(i < 0){
            negative++
        }
    }

    val df = DecimalFormat("#.######")
    positive = (positive/arr.size)
    negative = (negative/arr.size)
    zero = (zero/arr.size)

    println("${df.format(positive)}")
    println("${df.format(negative)}")
    println("${df.format(zero)}")
}


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}