## Part 1 -- Arrays
1, Array Initializers 
`{1,2,3}` can only used when array variable is declaration.
For example `int[] a = {1,2,3};`
if later I try to assign `a = {3,4,5}` will cause an error: Array Constants can only be used in Initializers. 
To fix it, I can do: `a = new int[]{3,4,5};`
