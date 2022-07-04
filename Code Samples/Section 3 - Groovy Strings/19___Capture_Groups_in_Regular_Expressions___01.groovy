def s = 'Friday is my favourite day!'

s =~ /(.*) is my favourite day!/  // true
s =~ (/(.*) is my favourite day!/)[0]  // list of input string, and first captured group (Friday)
s =~ (/(.*) is my favourite day!/)[0][1]  // Friday (the actual capture group)