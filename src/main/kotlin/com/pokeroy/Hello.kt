package com.pokeroy

fun main(args: Array<String>) {
//    println("你好，Kotlin!!")
    val human = Human()
    human.sayHello()

    val myName:String = "Pokeroy";
    var number = 1;
    println(myName+" "+number);
}


class Human(){
    fun sayHello(){
        println("Hello Kotlin !!!!!!!!")
        println("Nice to meet you ")
    }
}