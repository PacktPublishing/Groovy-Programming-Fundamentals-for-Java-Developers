def l = [1, 2, 3, 4, 5]
l.inject(0) { sum, e -> sum + e }  // returns sum
l.inject(0) { max, e -> Math.ax(max, e) }  // returns max