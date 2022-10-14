package New;

public class Flat {
    static public void main(String[] args) {
        for (String FlateState : args) {
            if (FlateState.equals("isMoney"))
                System.out.println("Enough money for new flat");
            else if (FlateState.equals("search")) {
                System.out.println("searched suitable flat");
            } else if (FlateState.equals("check")) {
                System.out.println("The seller is reliable");
            } else if (FlateState.equals("permission")) {
                System.out.println("The bought is completed");
            } else {
                System.out.println("Stay in old apartment");
            }
        }
    }
    }