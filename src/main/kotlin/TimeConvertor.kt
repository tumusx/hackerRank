/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    val lastValue = s.substring(s.length - 2)
    if (lastValue == "PM") {
        print("Y")
    }else{
        print("X")
    }
    return s
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
