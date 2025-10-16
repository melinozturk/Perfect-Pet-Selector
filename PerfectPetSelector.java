// Melin Ozturk
// 10/13/2025
// This program will create a system which when implemented will calculate with perfect accuracy the proper pet for anyone based on the user inputs. 

import java.util.*;
public class PerfectPetSelector{

    public static void main(String [] args)
    {
    
        Scanner scanner = new Scanner(System.in) ;
        String letter;
            
            // Enter username and press Enter
            System.out.println("Enter name"); 
            letter = scanner.nextLine().toLowerCase();
               
            System.out.println("Name: " + letter);
        
            String color;
            
            // Enter username and press Enter
            System.out.println("Enter favorite color"); 
            color = scanner.nextLine().toLowerCase();   
               
            System.out.println("Favorite color: " + color);
  

      
       
            String season;
            
            // Enter username and press Enter
            System.out.println("Enter favorite season");
            season = scanner.nextLine().toLowerCase();   
               
            System.out.println("Favorite season: " + season);
            
            if (color.equals("blue")){
            if (season.equals("fall")){
                System.out.println("Alligator is your perfect pet!");

            }
                else if (season.equals("spring"))
                {
                    System.out.println("Ostrichis your perfect pet!");
                }
                else if (!season.equals("fall"))

                if (!season.equals("summer"))
                {
                System.out.println("Ostrichis your perfect pet!");
                }

        if (color.equals("green")){
            if (season.equals("winter"))
            if (!letter.equals("aeiou"))
            {
                System.out.println("Giraffe is your perfect pet!");

            }
                else if (!season.equals("fall"))
                {
                    System.out.println("Dog is your perfect pet!");
                }
        }
            
        if (color.equals("red")){
            System.out.println("Panda is your perfect pet!");
        }
            
                else if (!letter.equals("aeiou"))
            System.out.println("Porcupine is your perfect pet!");    
            }
                else if (season.equals("summer"))
                {
                    System.out.println("Pony is your perfect pet!");
                }
        

        else {
            System.out.println("Rock is your perfect pet!");
        }
    }
}
    


    


