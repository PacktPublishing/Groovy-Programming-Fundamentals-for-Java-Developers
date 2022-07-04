class Greeting {
	String message
}

Greeting g = new Greeting(message: 'Hello')
+g  // groovy.lang.MissingMethodException for Greeting.positive()