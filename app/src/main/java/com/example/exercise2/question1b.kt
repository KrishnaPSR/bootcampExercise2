package com.example.exercise2
/*program to print your Firstname,LastName & age using  companion object.
*/
class Name1{
    companion object Name{
        fun fname()= println("My First name is Krishna")
        fun lanme()=println("My last name is Pratap")
        fun age()=println("My age is 22")
    }
}
fun main(args:Array<String>){
    Name1.fname()
    Name1.lanme()
    Name1.age()
}