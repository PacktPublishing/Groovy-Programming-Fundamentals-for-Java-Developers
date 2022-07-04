def name = 'Alex'

def emailText = 
"""
Hi there, $name!

Thanks for signing up, you're awesome!

Have a great day!

The Groovy Team
"""

println 'Email:'
println emailText
emailText.getClass()  // org.codehaus.groovy.runtime.GStringImpl