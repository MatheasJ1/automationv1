27. Yes the exact same patterns imerge when trying to run the methods a second time.
28. it makes every value in the array 0 so basically resets the values.
29. The patterns stay the same but the first state on the automaton changes.
No the patterns are not deterministic as the patterns always come back to what they where 
usually.
31. it does because nextstate is created to take new values based on the same old generated one.
If you store everything into state while youre reading from it, new and old values mix up and the behaviour of the rule changes.
32. Using a complete array would be better as it's alot easier to access and compare. the cells update simultaneously while keeping 
everything in the same array would make the loop alot easier to break, updates wouldn't be automatic.
35. since there's 0 and 1 and theres 3 different positions they could be in (2 to the power 3) there's 8 possible patterns (2 power 8) = 256;
so no not infinite.