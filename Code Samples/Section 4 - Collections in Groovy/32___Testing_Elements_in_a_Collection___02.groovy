class Person {
	String name
	int age
}

def namesAndAges = [
	new Person(name: 'Simon', age: 45),
	new Person(name: 'Robert', age: 50),
	new Person(name: 'Suzie', age: 65)		
]
namesAndAges.every { it.age >= 40 }  // true