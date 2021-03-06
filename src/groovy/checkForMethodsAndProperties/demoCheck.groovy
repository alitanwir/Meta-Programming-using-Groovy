package checkForMethodsAndProperties

/**
 * Created by ali on 29/7/16.
 */
//=============================================
// Check for Methods and Properties
//=============================================
class Person {
    String name
    Integer age

    String sayHi() {
        "Hi, my name is ${name} and I'm ${age}"
    }

    String sayHiTo(String name) {
        "Hi ${name}, how are you?"
    }
}

def p = new Person(name: 'Superman', age: 34)

assert p.respondsTo('sayHi')
if (p.respondsTo('sayHi'))
    println(p.sayHi())
assert p.respondsTo('sayHiTo', String)
assert !p.respondsTo('goodbye')

assert p.hasProperty('name')
assert !p.hasProperty('country')