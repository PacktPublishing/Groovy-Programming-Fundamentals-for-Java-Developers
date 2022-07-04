@groovy.transform.ToString(includeNames = true)
class BoxDimensions {
	int x, y, z
}

static BoxDimensions calculate() {
	// do some calculation...
	// ...then return the dimensions
	new BoxDimensions(x: 10, y: 12, z: 30)
}

public static void main(String[] args) {
	BoxDimensions dimensions = calculate()
	
	// calculation 1
	int area = dimensions.x * dimnensions.y
	
	// calculation 2
	// calculation 3
	//    	 :
}