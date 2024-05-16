/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {
#test the git pull
    public static void main() {

        int i = 1;

        while (i < 100) {

            dofizzgame(i);

            i++;
        }
    }

    public static void dofizzgame(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
