public class Excersice1 {
    public static void main(String[] args) {
        int random = (int)(Math.random() * 10);
        int random1 = (int)(Math.random() * 10);
        int random2 = (int)(Math.random() * 10);

        int sumOfRandom = random + random1 + random2;

        System.out.println("number 1 = " + random);
        System.out.println("number 2 = " + random1);
        System.out.println("number 3 = " + random2);
        System.out.println(sumOfRandom);

    }
}
