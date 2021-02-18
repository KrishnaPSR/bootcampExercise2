package com.example.exercise2
/*Create Kotlin classes having suitable attributes for Library management system.Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
*/
open class lib(){
    val b1 = "Physics"
    val b2 = "Chemistry"
    val b3 = "Math"
    val b4 = "Biology"
    open fun booksAvailable(){
        println("These books are availabe ${b1}, ${b2}")
    }

    open fun booksUnavailable(){
        println("These books are unavailable ${b3},${b4}")
    }
}

abstract class books{
    abstract fun addBooks()
}

interface report{
    fun checkCost()
}

class A: lib(), report {
    override fun booksAvailable() {
        super.booksAvailable()
    }
    override fun booksUnavailable() {
        super.booksUnavailable()
    }

    override fun checkCost() {
        println("Cost of two books is ${500}")
    }
}

class B:books(){
    val b5 = "History"
    val b6 = "Geography"
    override fun addBooks() {
        println("Added Books are  ${b5},${b6}")
    }
}
class question4{
    fun library(){
        val a = A()
        a.booksAvailable()
        a.booksUnavailable()
        a.checkCost()
        val b = B()
        b.addBooks()
    }
}