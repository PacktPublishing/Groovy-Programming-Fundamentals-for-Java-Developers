def numbers = [1, 2, 3, 4, 5]
numbers.findAll { e ->
	e % 2 == 1
} // 1, 3, 5
numbers.findAll { e -> e % 2 == 1 }  // all on one line
numbers.findAll { it % 2 == 1 }  // using it
numbers.findAll { it % 2 == 1 }.getClass()  // java.util.ArrayList