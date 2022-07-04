def re = ~'S.*'  // Sugar, Sweet, Syrup

def matcher = re.matcher('Sweet')

matcher.getClass()  // java.util.regex.Matcher
matcher.matches()  // true