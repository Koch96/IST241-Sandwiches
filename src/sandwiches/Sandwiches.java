package sandwiches;

/**@author sak5680*/

import java.util.Scanner;


public class Sandwiches {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sandwich mySandwich = new Sandwich();
        
        String response = "yes";
        
        System.out.print("Would you like to order a sandwich: ");
        response = sc.next();
        response = response.toLowerCase();
        
        System.out.println("What type of bread would you like?");
        System.out.print("Panini or Hoagie: ");
        mySandwich.setType(sc.next());
        System.out.println("What meat would you like?");
        System.out.print("Ham, Turkey, None: ");
        mySandwich.setMeat(sc.next());
        System.out.println("What cheese would you like?");
        System.out.print("Cheddar, Swiss, None: ");
        mySandwich.setCheese(sc.next());
        System.out.println("Would you like any extras?");
        System.out.print("Enter up to 5: ");
        mySandwich.setExtras(sc.nextInt());
        
        System.out.println("You ordered a " +
                            mySandwich.getType() +
                            " sandwich with " +
                            mySandwich.getMeat() + " and " +
                            mySandwich.getCheese() + " with " +
                            mySandwich.getExtras() + " extra toppings.");
        System.out.println("Your sandwich cost $" + mySandwich.calcPrice());
    }

}
