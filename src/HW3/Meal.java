package HW3;

public class Meal {
    static public void main (String[] args) {
        for (String MealState : args) {
            if (MealState.equals("hungry")) {
                System.out.println("cook yourself");
            } else if (MealState.equals("reception")) {
                System.out.println("choose what you want to eat");
            } else if (MealState.equals("noingridience")) {
                System.out.println("buy the one");
            } else System.out.println("go for a walk");
        }
    }
}
