package com.example.dagger2simple

object Container {
    fun provideDriver() = Driver()

    fun provideEngine() = Engine()
}