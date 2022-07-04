def fruits = ['apples', 'oranges', 'pears', 'oranges']

static void capitalizeThreeStrings(String... args) {
	args.each { println 'Element = ' + it }
}

capitalizeThreeStrings(*fruits)