class Person {
	String name
	
	Person(name) {  // we've dropped the type - legal in Groovy!
		this.name = name
	}

	def greet() {
		println "Hello, I'm $name!"
	}	
}

class Emnployee extends Person {
	int salary
	
	Employee(String name, int salary) {
		super(name)
		this.salary = salary
	}
	
	def reportForWork() {
		"Here sir, ready and willing for the long day ahead!"
	}
	
	def greet() {
		println "Hello, I'm $name, I earn $salary"
	}		
}

public static void main(String[] args) {
	Employee e = new Employee('Matt', 25000)
	e.greet()
	println e.reportForWork()
}