package com.example.fizzbuzz
fun fizzbuzz(n:Int):String{
    var fbz= mutableListOf<String>()
    if(n%3==0) fbz.add("Fizz")
    if(n%5==0) fbz.add("Buzz")
    if(n%7==0) fbz.add("Bang")
    if(n%11==0) fbz=mutableListOf("Bong")
    if(n%13==0) fbz.add(if (fbz.contains("Fizz")) 1 else 0,"Fezz")
    if(n%17==0) fbz=fbz.asReversed()
    if (fbz.isEmpty()) {
        return n.toString()
    }
    return fbz.joinToString("")
}
fun main(){
    println("How far do you want to go?")
    var max:Int
    while (true){
        try{
            max= readLine()?.toInt()?:100
            break
        }catch(e:NumberFormatException){
            println("That's not a number!")
        }
    }
    var out=""
    for (n in 1..max){
        out+= fizzbuzz(n)+"\n"
    }
    println(out)
}