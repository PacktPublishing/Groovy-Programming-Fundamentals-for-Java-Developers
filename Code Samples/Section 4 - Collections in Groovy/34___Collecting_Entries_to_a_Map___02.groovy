class Person {
	String name
	int age
}

def l = [
	new Person(name: 'Matt', age: 25),
	new Person(name: 'Alan', age: 32),
	new Person(name: 'Gavin', age: 34)	
]
l.collectEntries { [(it.age): it.name.toUpperCase()] }  // map keyed by age 