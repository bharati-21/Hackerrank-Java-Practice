/*
Problem Link : https://www.hackerrank.com/challenges/java-factory/problem
*/

// Solution :
import java.util.*;
import java.security.*;

interface Food {
    public String getType();
}
class Pizza implements Food {
	  public String getType() {
	      return "Someone ordered a Fast Food!";
	  }
}
class Cake implements Food {
    public String getType() {
	      return "Someone ordered a Dessert!";
	  }
}
class FoodFactory {
    public Food getFood(String order) {
        if(order.equals("cake")) {
            return new Cake();
        }
        return new Pizza();
    }
}
public class Problem59 {
    public static void main(String args[]) {
        try {
      			Scanner sc=new Scanner(System.in);
      			FoodFactory foodFactory = new FoodFactory();
	      		Food food = foodFactory.getFood(sc.nextLine());
	          System.out.println("The factory returned "+food.getClass());
			      System.out.println(food.getType());
		    }
		    catch (Exception e) {
			      System.out.println("Unsuccessful Termination!!");
		    }
	  }
}

		




