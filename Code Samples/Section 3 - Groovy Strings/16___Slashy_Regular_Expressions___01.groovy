def re = ~/S.*/  // Sugar, Sweet, Syrup

~'\d'  // doesn't compile since slash isn't escaped
~'\\d'  // compiles now but clunky
~/\d/  // forward slashes means you don't need to do the escaping now - nicer!