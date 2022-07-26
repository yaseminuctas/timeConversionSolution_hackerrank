package com.example.hackerranktimeconversionsolution

import kotlin.io.*
import kotlin.text.*

class Solution {
/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

    fun timeConversion(s: String): String {

        val getZone = s.substring(8, 10)
        val getTime = s.substring(0, 8)
        val getHour = s.substring(0, 2)
        val getMinutes = s.substring(2, 8)

        var result: String


        result = if (getZone == "AM") {
            if (getHour == "12") {
                "00$getMinutes"
            } else {
                getTime
            }
        } else {
            var newFormatHour = getHour.toInt() + 12
            if (getHour == "12") {
                getTime
            } else {
                "$newFormatHour$getMinutes"
            }
        }

        return result
    }

    fun main(args: Array<String>) {
        val s = readLine()!!

        val result = timeConversion(s)

        println(result)
    }

}