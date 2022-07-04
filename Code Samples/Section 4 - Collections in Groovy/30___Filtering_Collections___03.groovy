class Person {
	String name
	int age
}

def namesAndAges = [
	new Person(name: 'Robert', age: 50),
	new Person(name: 'Simon', age: 45),
	new Person(name: 'Suzie', age: 32)		
]
namesAndAges.findAll { it.age >= 40 }.each { println 'Name: ' + it.name }  // prints Robert and Simon