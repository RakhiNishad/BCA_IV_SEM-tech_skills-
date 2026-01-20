package Tach_skill_BCA;
import java.util.Scanner;
    // GIVEN AN ARRAY COUNT NUMBER OF ELEMents . HAVING ATLEAST ONE ELEM ,GRATER THEN ITS SELF
//eg:- [-3 2 6 8 4 8 5]
//observation:- for every max element there want be any element gater tham itself
                             //or
//PSEUDO CODE:- 
// Iterate and findthe max element from the array
// iterate and get the no. of elements that are not equale of max
// increment the counter

public class array 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={-3,2,6,8,4,8,5};
        int count =0;
        int max=0;
        for (int i=0;i<arr.length;i++)
        {
           if(arr[i]>max)
           {
            max=arr[i];
           }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=max)
                count++;
        }
        System.out.println(count);
    }
}
