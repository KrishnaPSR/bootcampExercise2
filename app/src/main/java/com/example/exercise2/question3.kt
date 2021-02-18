package com.example.exercise2
/*	Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every bank.

*/
open class bank {
    open fun getDetails(){
        var roi = 5
        var totalemployees = 5000
        var location = "Uttar Pradesh"
        println("rate of Interest: "+roi+ ",Total Employees: "+totalemployees+", Location: "+location)
    }
}

class SBI:bank(){
    override fun getDetails() {
        var roi = 5
        var totalemployees = 1000
        var location = "Mainpuri"
        println("rate of Interest: "+roi+ ",Total Employees: "+totalemployees+", Location: "+location)
    }
}

class BOI:bank(){
    override fun getDetails() {

        var roi = 5
        var totalemployees = 2000
        var location = "Agra"
        println("rate of Interest: "+roi+ ",Total Employees: "+totalemployees+", Location: "+location)

    }
}

class ICICI:bank(){
    override fun getDetails() {

        var roi = 4
        var totalemployees = 4000
        var location = "Dehradun"
        println("rate of Interest: "+roi+ ",Total Employees: "+totalemployees+", Location: "+location)
    }
}

class question3() {
    fun showdetails() {
        val b = bank()
        b.getDetails()
        val sbi = SBI()
        sbi.getDetails()
        val boi = BOI()
        boi.getDetails()
        val icici = ICICI()
        icici.getDetails()
    }
}