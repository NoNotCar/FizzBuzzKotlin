package com.example.fizzbuzz

fun main(){
    for (n in 1..100){
        var s=""
        if (n%3==0){
            s=s.plus("Fizz")
        }
        if (n%5==0){
            s=s.plus("Buzz")
        }
        if (s==""){
            s=n.toString()
        }
        print(s.plus("\n"))
    }
}