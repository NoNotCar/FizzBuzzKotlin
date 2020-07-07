package com.example.fizzbuzz

fun main(){
    for (n in 1..255){
        var fbz= mutableListOf<String>()
        if (n%3==0){
            fbz.add("Fizz")
        }
        if (n%5==0){
            fbz.add("Buzz")
        }
        if (n%7==0){
            fbz.add("Bang")
        }
        if (n%11==0){
            fbz= mutableListOf("Bong")
        }
        if (n%13==0){
            var firstb=0
            for ((i,fb) in fbz.withIndex()){
                if (fb[0]=='B'){
                    firstb=i
                    break
                }
            }
            fbz.add(firstb,"Fezz")
        }
        if (n%17==0){
            fbz=fbz.asReversed()
        }
        if (fbz.isEmpty()) {
            print(n.toString())
        }else{
            print(fbz.joinToString(""))
        }
        print("\n")
    }
}