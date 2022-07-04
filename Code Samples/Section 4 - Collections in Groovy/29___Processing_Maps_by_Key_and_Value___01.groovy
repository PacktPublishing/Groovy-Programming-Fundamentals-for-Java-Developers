def m = [
	'Monday': ['Record courses', 'Do exercise'],
	'Friday': ['Relax', 'Spend time with family', 'Walk dog']
]

m.each { k, v -> 
	println "$k = $v"
}

for (entry in m) {
	println 'Key = ' + entry.key
	println 'Value = ' + entry.value	
}