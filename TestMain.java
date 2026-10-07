

import java.util.*;

public class TestMain {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        String decision = "";
        
        while (!decision.equalsIgnoreCase("no")) {
         System.out.println("Enter 5 words - ");
            for (int i = 0; i < 5; i++) {
               System.out.print(i+1 + ". ");
               String names = input.next();
               name.add(names);
            }
            
        System.out.print("Add 5 more names? (yes/no) > ");
        decision = input.next();
        System.out.println();
         
         }
        
   input.close();
   System.out.println("You entered: " + name);
   }
}

/*

Enter 5 words - 
 1. Crystal
 2. Karla
 3. Charlie
 4. Tim
 5. Chia-Chi
 Add 5 more names? (yes/no) > yes
 
 Enter 5 words - 
 1. Meriga
 2. Gabriel
 3. Luke
 4. Thea
 5. Mizpah
 Add 5 more names? (yes/no) > YES
 
 Enter 5 words - 
 1. Cole
 2. Angelique
 3. Muhammad
 4. Aiden
 5. Naz
 Add 5 more names? (yes/no) > no
 
 You entered: [Crystal, Karla, Charlie, Tim, Chia-Chi, Meriga, Gabriel, Luke, Thea, Mizpah, Cole, Angelique, Muhammad, Aiden, Naz]
 
 */
 