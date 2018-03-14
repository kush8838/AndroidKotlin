package com.example.shree.firstproject

/**
 * Created by SHREE on 14/03/2018.
 */

//val boxedInts = arrayOfNulls<Int>(20)
fun main(args: Array<String>) {
    val myInts = intArrayOf(1, 1, 2, 3, 5, 8, 13, 21,53,232,11,22,44,12,45,12,56,78,56,88)


    println("Even numbers in array are:-")
    for (i in myInts.indices) {
        if((myInts[i]%2)==0) {
            println(myInts[i])
        }
    }

    println("Odd numbers in array are:-")
    for (i in myInts.indices) {
        if((myInts[i]%2)!=0) {
            println(myInts[i])
        }
    }
}
