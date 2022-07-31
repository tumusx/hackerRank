fun miniMaxSum(arr: Array<Int>): Unit {
    //TODO sempre posicao -1
    val arr2MinMax = arr.map { it.toBigInteger() }
    val minSum = arr2MinMax[0]+arr2MinMax[1]+arr2MinMax[2]+arr2MinMax[3]
    val maxSum = arr2MinMax[1]+arr2MinMax[2]+arr2MinMax[3]+arr2MinMax[4]
    println("$minSum $maxSum")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
