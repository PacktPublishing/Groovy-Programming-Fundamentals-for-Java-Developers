import groovy.transform.ToString

@ToString   // can also use fully qualified classname to avoid import statement
class Person {
	String name
	int age
}

public static void main(String[] args) {
	new Person()  // has nice string representation now
}