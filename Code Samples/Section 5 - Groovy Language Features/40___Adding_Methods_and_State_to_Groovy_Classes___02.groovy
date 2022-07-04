class Person {
	String name
	
	Person(String name) {
		this.name = name
	}

	void greet() {
		println "Hello, I'm $name!"
	}	
}

public static void main(String[] args) {
	Person p = new Person('Matt')
	p.greet()
}