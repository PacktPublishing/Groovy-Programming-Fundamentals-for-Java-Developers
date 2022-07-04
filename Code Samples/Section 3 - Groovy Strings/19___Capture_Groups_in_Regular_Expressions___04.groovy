def s = /Sunday is Dave's favourite day!/

def captures = (s =~ /(.*) is my favourite day!/)[0]
def dayOfWeek = captures[1]  // Monday
def whoseDay = captures[2]  // my

println "$whoseDay best day of the week is $dayOfWeek"