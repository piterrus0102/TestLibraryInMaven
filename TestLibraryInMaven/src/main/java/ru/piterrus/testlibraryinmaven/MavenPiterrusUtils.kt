package ru.piterrus.testlibraryinmaven

class MavenPiterrusUtils {
    companion object {
        fun add(a: Int, b: Int) : Int {
            return a + b
        }

        fun divide(a: Int, b: Int) : Int {
            if(b == 0) throw ArithmeticException()
            return a / b
        }
    }
}