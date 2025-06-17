import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int [] array = new int[5];
        for (int i = 0 ; i<5 ; i++){
            array [i]= sc.nextInt();
            
        }
        int left = 0;
        int right = 4;
        while(left < right){
            int temp = array[left];
                array[left] =array[right];
                array[right] = temp;
                left++;
                right--;
        }
        for(int i = 0 ; i< 5; i++){
            System.out.println(array[i]);
        }
    }
}