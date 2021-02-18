package com.example.exercise2
/*Write a function which take marks as an argument and return the the grade as follows:
marks between 50 to 60 , return “Good”
marks between 60 to 70, return “Very Good”
marks between 70 to  80, return “Excellent”
marks between  80 to 100, return “Rockstar”
*/

fun main(args: Array<String>) {

    println("\nEnter The Mark: ")
    var marks=Integer.valueOf(readLine())
    if (marks > 50 && marks < 60)
        println("Good")
    else if (marks>60 && marks<70)
        println("VeryGood")
    else if(marks>70 && marks<80)
        println("Excellent")
    else if (marks >80 && marks<=100)
        println("Rockstar")

}
