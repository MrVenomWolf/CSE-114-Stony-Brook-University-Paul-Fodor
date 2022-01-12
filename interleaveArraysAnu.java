import java.util.*;
public class interleaveArraysAnu {
	
	public static int[] leavearray(int[] a, int[] b){

        int s =0;

        int l = 0;

            if(a.length < b.length){

                s = a.length;
                l = b.length;

            } else{

                s = b.length;
                l = a.length;

        }
        int[] interleavearray = new int[a.length+b.length];

            for(int i = 0; i < s; i++){

                interleavearray[2*i]= a[i];
                interleavearray[2*i+1] = b[i];
           }
            
            for(int j = 0; j < l-s; j++){

                if(l == a.length && a.length % 2 == 0){
                    interleavearray[j+(2*s)] = a[j+(l-s)];

                }else if(l == a.length){
                    interleavearray[j+(2*s)] = a[j+(l-s)+1];

               
                }else if(l == b.length && b.length % 2 == 0){
                    interleavearray[j+(2*s)] = b[j+(l-s)];

               
                }else{
                    interleavearray[j+(2*s)] = b[j+(l-s)+1];
                }
            }
            return interleavearray;
    }
       
	    public static void main(String[] args){

            System.out.println(Arrays.toString(leavearray(new int[]{1,3,5},new int[]{2,4,6})));

            System.out.println(Arrays.toString(leavearray(new int[]{10,20,30,40,50,60,70,80} ,new int[]{2,4,6,8})));

            System.out.println(Arrays.toString(leavearray(new int[]{1,3,5},new int[]{2,4,6,8,10})));
        }



}


