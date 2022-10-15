public class Warning_Alart {
    static public void main (String[] args){
        for (String AlartState : args) {
            if (AlartState.equals("goOff")) {
                System.out.println("Warning alart goes off");
                System.out.println("Go to the shelter");
            } else if (AlartState.equals("noCancel")) {
                System.out.println("Stay in the shelter");
                System.out.println("Wait for canceled");
            } else {
                System.out.println("keep trying to be safe");
                System.out.println("be attentive to warning alart");
            }
        }
    }
}
// goOff noCancel