def name = 'Matt'
def s = "How are you, $name?"  // interpolation being used, can also use ${name}
println 'String is: ' + s
s.getClass()  // org.codehaus.groovy.runtime.GStringImpl