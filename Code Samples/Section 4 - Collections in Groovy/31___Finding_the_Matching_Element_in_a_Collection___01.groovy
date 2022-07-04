class Person {
	String name
	int age
}

def namesAndAges = [
	new Person(name: 'Robert', age: 50),
	new Person(name: 'Simon', age: 45),
	new Person(name: 'Suzie', age: 32)		
]
namesAndAges.find { it.age >= 40 }.name  // just the first match, Robert