/*
Object oriented programming Lab 5 question 4
Complete the 

static int count(int[] array) 

method to count and return the number of negative elements in the input array. 
 
For example:
Test	Result
System.out.println(count(new int[]{-10,-4,-5,6,7}));	3
System.out.println(count(new int[]{}));	0
System.out.println(count(new int[]{-10,-4,-5,-6,-7}));	5




Starter code
static int count(int[] array)
{
   return 0;
}
*/
static int count(int[] array)
{
    int negativeCount = 0;
    
    // Check if array is empty
    if (array.length == 0) {
        return 0;
    }
    
    // Iterate through each element in the array
    for (int i = 0; i < array.length; i++) {
        // Check if the current element is negative
        if (array[i] < 0) {
            negativeCount++;
        }
    }
    
    return negativeCount;
}
