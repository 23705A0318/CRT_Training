import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        int []array = new int[5];
        int[] reversed_array = new int[5];
        Scanner sc = new Scanner (System.in);
        for(int i=0 ; i< 5; i++){
            array[i] = sc.nextInt();
            
        }
        int vivek = 0;
    for(int nanda = 4 ; nanda>=0;nanda--){
        reversed_array[vivek] = array[nanda];
        vivek++;
        
    }
    System.out.println("----------------------------");
    for(int i = 0 ; i<5 ; i++){
        System.out.println(reversed_array[i]);
    }
    }
}