package com.mangolab.bigcatkotlin.practice

/**
 * Created by rajforhad on 04/01/2017.
 */
class Customer(val name: String, val email : String)

fun main(args: Array<String>) {
    val customer = Customer("demouser", "demo@gmail.com");
    println(customer);
    println("Hello & welcome " + customer);
}
