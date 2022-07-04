@groovy.transform.ToString
class Greeting {
	String message
	
	Greeting positive() {
		return new Greeting(message: this.message.toUpperCase())
	}
}

Greeting g = new Greeting(message: 'Hello')
+g  // Greeting with HELLO in it