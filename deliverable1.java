import java.util.Scanner;

class deliverable1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String colour[] = {"Red", "Yellow", "Green", "Blue"};
        String cardValue[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Skip", "Reverse", "Drawtwo", "Drawfour", "Wildcard"};
        String redSet[] = new String[15];
        String yellowSet[] = new String[15];
        String blueSet[] = new String[15];
        String greenSet[] = new String[15];
        for (int i = 0; i < redSet.length; i++) {
            redSet[i] = colour[0] + " " + cardValue[i];
        }
        for (int i = 0; i < yellowSet.length; i++) {
            yellowSet[i] = colour[1] + " " + cardValue[i];
        }
        for (int i = 0; i < blueSet.length; i++) {
            blueSet[i] = colour[3] + " " + cardValue[i];
        }
        for (int i = 0; i < greenSet.length; i++) {
            greenSet[i] = colour[2] + " " + cardValue[i];
        }

        for (String x: redSet){
            System.out.println(x);
        }
        
        for (String y: yellowSet){
            System.out.println(y);
        }
        for (String a: greenSet){
            System.out.println(a);
        }
        for (String b: blueSet){
            System.out.println(b);
        }

        int c = (int) (Math.random()* (3 - 0 + 1) + 0);
        int d = (int) (Math.random()* (14 - 0 + 1) + 0);
        System.out.println();
        System.out.println("Welcome to the card game !!!");
        System.out.print("Enter your colour: ");
        String f = input.nextLine();
        System.out.print("Enter your value: ");
        String g = input.nextLine();
        System.out.println();

        if (f.equals(colour[c]) == true && g.equals(cardValue[d]) == true) {
            System.out.println("The card you need to find: " + colour[c] + " " + cardValue[d]);
            System.out.println("You win !!!");
        } else {
            System.out.println("The card you need to find: " + colour[c] + " " + cardValue[d]);
            System.out.println("You lose...");
        }

        
    }
}

