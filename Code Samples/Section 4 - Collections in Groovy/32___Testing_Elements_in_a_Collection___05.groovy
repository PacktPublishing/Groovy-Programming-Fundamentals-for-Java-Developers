class Person {
	String name
	int age
}

def namesAndAges = [
	new Person(name: 'Simon', age: 39),
	new Person(name: 'Robert', age: 30),
	new Person(name: 'Suzie', age: 32)		
]
namesAndAges.any { it.age >= 40 }  // false