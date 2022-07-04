def s = 'Monday is my favourite day!'

def dayOfWeek = (s =~ (/(.*) is my favourite day!/)[0][1]

println 'Day of week: ' + dayOfWeek