package com.example.exercise2

fun main(args:Array<String>){
    var mutableList= mutableListOf("1","2","3")
    println("Mutable List")
    for(element in mutableList){
        println(element)
    }
    mutableList.set(1,"krishna")
    print(mutableList)
}