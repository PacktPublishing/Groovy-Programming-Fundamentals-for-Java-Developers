def fruits = ['Apples', 'Oranges', 'Pears']

static void capitalizeThreeStrings(String a, String b, String c) {
	println 'A = ' + a
	println 'B = ' + b
	println 'C = ' + c		
}

capitalizeThreeStrings(*fruits)