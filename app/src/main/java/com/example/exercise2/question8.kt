package com.example.exercise2

fun main(args:Array<String>) {

    val items = HashMap<String, Int>()

    items["A"]=1
    items["B"]=2
    items["C"]=3
    items["D"]=4
    items["E"]=5

    for ((k, v) in items) {
        println("$k = $v")
    }
}