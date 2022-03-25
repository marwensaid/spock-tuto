package me.spock

import spock.lang.Specification

class MathMaxSpec extends Specification {

    def "computing the maximum of two numbers"() {
        expect: "maximum of the two numbers is correctly calculated"
        Math.max(a, b) == c

        where: "given two numbers"
        a << [5, 3]
        b << [1, 9]
        c << [5, 9]
    }
}
