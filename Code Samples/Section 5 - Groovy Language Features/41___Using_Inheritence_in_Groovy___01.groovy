class Person {
	String name
	
	Person(name) {  // we've dropped the type - legal in Groovy!
		this.name = name
	}

	def greet() {  // we're using def instead of the return type (weak typing)
		println "Hello, I'm $name!"
	}	
}

class Emnployee extends Person {
	int salary
	
	def reportForWork() {
		"Here sir, ready and willing for the long day ahead!"
	}
}

public static void main(String[] args) {
	Person p = new Employee('Matt')
	p.greet()
}