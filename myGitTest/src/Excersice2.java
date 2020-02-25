public class Excersice2 {
    public static void main(String[] args) {
        int die1;   // The number on the first die.
        int die2;
        int die3;// The number on the second die.
        int ttryings = 0;

        die1 = (int) (Math.random() * 6) + 1;

        do {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            die3 = (int) (Math.random() * 6) + 1;

            System.out.println("The first die comes up " + die1);
            System.out.println("The second die comes up " + die2);
            System.out.println("The third die comes up " + die3);
            ttryings++;
            System.out.println("Your total tryies is " + ttryings);
            System.out.println("--------------------");


        } while ((die1 != die2) || (die2 != die3));
    }
}