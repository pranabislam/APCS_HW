used system.nanotime for all three

Tested the spread of numbers, so the numbers generated ranged from only 1 number in the array (and array of 0's)
to numbers spreading all the way from 1-100000
--> isort and ssort held relatively constany regardless of spread of numbers, even with an array of all 0s
---> builtin sort became faster when the spread was greater. it was just a correlation, nothing defining but i noticed
more times out of 10 when the spread was high, builtin became faster

isort was always the fastest, it was always a magnitude of 10 or 2 faster (in nanoseconds) than the other two sorts
which is intersting even though ssort and isort are both n^2 algorithms

when i tested the backwards ordered array (check method backwards in sarray.java), nothing interesting happened. isort was 
still the fastest and ahead by a magnitude or two of ten. 

