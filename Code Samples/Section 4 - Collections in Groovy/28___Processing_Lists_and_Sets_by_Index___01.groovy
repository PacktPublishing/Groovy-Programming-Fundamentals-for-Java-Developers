def l = [1, 2, 3, 4, 5]

l.eachWithIndex { el, idx -> 
	println 'Current element = ' + el + ', Iteration # = ' + idx
}