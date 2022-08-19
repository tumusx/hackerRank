/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
     if(s.contains("PM")){
         val numbersHours = s[0].toString() + s[1].toString()
         print(numbersHours.toInt() + 12)
    }else{
         var numbersHours = s[0].toString() + s[1].toString()
        if(numbersHours.toInt() == 12) numbersHours = "00"
        s.replace("AM", "PM")
         numbersHours.removeRange(0, 1)
         println(numbersHours.toInt().toString() + "0")
    }
    return s
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

}
