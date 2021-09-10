## Intuition
This is "big number" calculation. 
### method 1:
The logic is the add k to A starting from the last element of array
so the traverse start from index: num.length-1
`sum = currentA+ currentK + carry`
`carry = sum // 10`
`current = sum % 10`
`k \=10`
`i--`
you can choose to add the end of array and then do reverse to generate answer which is faster.
Or, you can use `array.add(0,current)` to always add to the head of the array, which will take O(N) to finish

### method 2:
if using python, you dont need to consider overflow of big number, so this problem can be done like this:
transfer array --> num, add with k, transfer back to array for answer

## Complexity Analysis
- time complexity: O(N)
- space complexity: O(N) since we need to create an array to store answer
- extra space complexity: O(1) as we only need to create sum, carry to store the value each time. 
