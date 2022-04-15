package com.example.dagger2simple

fun main(args: Array<String>) {
//    val engine = Engine()
//    val driver = Driver()

 //   val car = Car(engine, driver)
    val car = Car(Container.provideEngine(), Container.provideDriver())
}