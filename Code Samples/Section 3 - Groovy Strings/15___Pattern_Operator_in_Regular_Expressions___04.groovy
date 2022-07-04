def re = ~'l.*'  // Sugar, Sweet, Syrup

def matcher = re.matcher('Sweet')

matcher.matches()  // false