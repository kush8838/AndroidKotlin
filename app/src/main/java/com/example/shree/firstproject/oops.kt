package com.example.shree.firstproject

/**
 * Created by SHREE on 13/03/2018.
 */

class Mouse
{
    private var txt: String="hi"

    constructor(tx:String)  //secondary constructor
    {
        this.txt=tx;
    }
    fun whtTxt()=txt
}

interface Gps{
    fun locate()
}
open class Car(
        private val pz:Int =10 //primary constructor
)
{
    fun whtPz(nm: Int=10):Int = pz * nm
}

class Bmw(
        private var pz: Int,
        private var spd: Float =150.04f
) : Car(pz) {
    //fun whtspd() = pz*spd
    infix fun whtspd(nm:Int) = pz*spd*nm
}
fun main(args: Array<String>) {
    val cr=Car()
    println("Car price is ${cr.whtPz(nm=15)}")
    val ms=Mouse(tx="Hp Mouse")
    println("In Mouse ${ms.whtTxt()}")

    val bm=Bmw(pz=15 , spd = 645.33f)
    println("Car price is ${bm.whtPz()} and Car speed is ${bm.whtspd(nm=100)}")
}