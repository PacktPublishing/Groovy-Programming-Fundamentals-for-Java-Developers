def l = [1, 2, 3, 4, 5]

l.each { element -> println element }
l.each { element -> l.remove(element) }  // illegal - cannot modify while traversing the list