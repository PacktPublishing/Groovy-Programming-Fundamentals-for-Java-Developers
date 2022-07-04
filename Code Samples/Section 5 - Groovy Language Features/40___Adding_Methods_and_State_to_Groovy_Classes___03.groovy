class Person {
	String name
	
	Person(name) {  // we've dropped the type - legal in Groovy!
		this.name = name
	}

	def greet() {  // we're using def instead of the return type (weak typing)
		println "Hello, I'm $name!"
	}	
}

public static void main(String[] args) {
	Person p = new Person('Matt')
	p.greet()
}