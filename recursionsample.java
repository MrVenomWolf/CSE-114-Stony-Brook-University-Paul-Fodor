
/*public class recursionsample {

/* Write a recursive method (that is, no loops of any kind: for, while, do-while or for-each)
to reverse an array of integers in-place (that is, modify the array itself without returning a new array)
Example: reverse([1,2,3,4,5]) will change the input array into [5,4,3,2,1]. */
   public static void reverse(int[] a){
    reverse(a, 0, a.length-1);
   }
   public static void reverse(int[] a, int low, int high){
    if(high<=low)
     return;
    int temp = a[low];
    a[low] = a[high];
    a[high] = temp;
    reverse(a, low+1, high-1);
   }
      

    


}

