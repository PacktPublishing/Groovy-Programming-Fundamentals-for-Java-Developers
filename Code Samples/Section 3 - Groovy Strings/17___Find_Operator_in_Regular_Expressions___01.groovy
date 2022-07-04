def re = ~/S.*/
'Sugar' =~ /S.*/  // java.util.regex.Matcher

('Sugar' =~ /S.*/).matches()  // true
('Sugar' =~ /m.*/).matches()  // false