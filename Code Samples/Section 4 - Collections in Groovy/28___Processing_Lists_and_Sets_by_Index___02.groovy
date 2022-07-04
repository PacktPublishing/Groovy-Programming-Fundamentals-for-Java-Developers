def l = [1, 2, 3, 4, 5] as Set

l.eachWithIndex { el ->    // maintains insertion order even though it's a set (since it's a linked set)
	println 'Current element = ' + el + '
}