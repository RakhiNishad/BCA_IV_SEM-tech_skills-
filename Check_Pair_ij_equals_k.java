
import java.util.*;

public class Check_Pair_ij_equals_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {3,-2,1,4,3,6,8};
        int k = 10;
        int Exist = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if((arr[i] + arr[j]) == k && (i != j)){
                    Exist++;
                    System.out.println("Pair is = "+arr[i]+" "+arr[j]);
                }
            }
        }
        if(Exist > 0){
            System.out.println("Yes, Pair Exist");
        }else{
            System.out.println("No, Pair doesn't Exist");
        }
    }
}
