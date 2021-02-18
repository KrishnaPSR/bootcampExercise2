package com.example.exercise2
/*program for following operation using overloading
  A) Adding 2 integer number
  B) Adding 2 double
  D) multiplying 2 int
  E) concate 2 string
  F) Concate 3 String
*/
fun add(a:Int,b:Int){
    var sum=a+b
    println(sum)
}
fun add(a:Double,b:Double){
    var sum=a+b
    println(sum)
}
fun mul(a:Int,b: Int){
    var pro=a*b
    println(pro)
}
fun concat(str1:String,str2:String){
    var str3="$str1$str2"
    println(str3)
}
fun concat(str1: String,str2: String,str3:String){
    var str4="$str1$str2$str3"
    println(str4)
}
class question2{
    fun ques2(){
        add(5,8)
        add(4.56,6.54)
        mul(4,5)
        concat("krishna","pratap")
        concat("Krishna","Pratap","Singh")
    }
}