@groovy.transform.ToString
class FoodOrder {
	String name
	BigDecimal cost
	
	FoodOrder(name, cost) {
		this.name = name
		this.cost = cost
	}
}

def driveThruOrder = [
  new FoodOrder('Burger', 3.99),
  new FoodOrder('Fries', 1.85),
  new FoodOrder('Milkshake', 2.75)    
]

driveThruOrder.sort()  // varies between runs
driveThruOrder.sort { a, b -> a.name <=> b.name }  // order by item name
driveThruOrder.sort { a, b -> a.cost <=> b.cost }  // order by item price
driveThruOrder.sort { a, b -> b.cost <=> a.cost }  // order by item price, most expensive first