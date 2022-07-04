def s = 'Monday is my favourite day!'

def captures = (s =~ /(.*) is my favourite day!/)[0]
def dayOfWeek = captures[1]  // Monday
def whoseDay = captures[2]  // my

println 'Day of week: ' + dayOfWeek
println 'Whose day: ' + whoseDay