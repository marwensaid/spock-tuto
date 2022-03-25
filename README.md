Spring Spock Tutorial
==================================================

The purpose of this project is simply to provide a  working example packaged with [maven](https://maven.apache.org) on 
how the [spock](http://docs.spockframework.org) framework can work along the [spring](https://spring.io) framework.

The [spock](http://docs.spockframework.org) framework has similarities with :

* [junit](http://junit.org)
* [mockito](http://mockito.org)

, but due to the fact that this is a library written in [groovy](http://www.groovy-lang.org) programming language,
it offers a very elegant way of writing _specifications as documentation_ of the project.

Below is a presented a piece of code, taken from the documentation of the spock library, which ilustrates the 
_specification as documentation_ concept :

```groovy
def "computing the maximum of two numbers"() {
  expect: "maximum of the two numbers is correctly calculated"
  Math.max(a, b) == c

  where: "given the numbers"
  a << [5, 3]
  b << [1, 9]
  c << [5, 9]
}
```

## Technologies used

* Spring Boot 1.3.1.RELEASE
* Spock 1.0
