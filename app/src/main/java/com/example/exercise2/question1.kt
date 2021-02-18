package com.example.exercise2
/*  program to print your Firstname,LastName & age using init block
*/
class Name {
    var fname: String
    var lname:String
    val age : Int

    init {
        fname = "Krishna"
        lname="Pratap"
        age = 22
    }
}

fun main(args: Array<String>) {

    val name = Name()
    println("Full name is ${name.fname} ${name.lname} and age is ${name.age}")

}






