import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);
        String name=sc.nextLine();
        int vowel_count =0;
        int consonant_count = 0;
        for(int i = 0 ; i < name.length() ; i++){
            char alpha = name.charAt(i);
            if(alpha == 'a' || alpha == 'e'|| alpha == 'i' || alpha == 'o' || alpha == 'u'){
                vowel_count++;
                
            }
            else{
                consonant_count++;
                
                
            }
            System.out.println(vowel_count+","+consonant_count);
        }
    }
}
        
        