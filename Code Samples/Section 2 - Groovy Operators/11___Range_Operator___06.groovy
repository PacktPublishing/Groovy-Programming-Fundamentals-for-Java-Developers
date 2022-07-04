enum Weekdays {
	MON, TUES, WEDS, THURS, FRI
}

(Weekdays.TUES..Weekdays.THURS).each { println it }
(Weekdays.TUES..<Weekdays.THURS).each { println it }
(Weekdays.TUES..Weekdays.THURS).getClass()  // groovy.lang.ObjectRange