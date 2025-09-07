import java.util.Scanner;
public class NumberGuessing {
    public static void main(String[] args){



                Scanner sc = new Scanner(System.in);

                System.out.println("********************************");
                System.out.println("Welcome To Number Guessing Game");
                System.out.println("********************************");

                int min = 1;
                int max = 10;
                int computerGuess = (int)(Math.random() * (max - min + 1)) + min; // fixed
                int attempts = 0;
                int maxAttempts = 7;

                while (attempts < maxAttempts) {
                    System.out.print("Enter your guess (" + min + "-" + max + "): ");
                    int guess = sc.nextInt();
                    attempts++;

                    if (guess == computerGuess) {
                        System.out.println("🎉 You Guessed Correctly 🥳");
                        System.out.println("Attempts used: " + attempts);
                        break;
                    } else if (guess > computerGuess) {
                        System.out.println("Too high ❌");
                    } else {
                        System.out.println("Too low ❌");
                    }

                    if (attempts == maxAttempts) {
                        System.out.println("❌ Attempts closed! The number was: " + computerGuess);
                    }
                }
                sc.close();
            }
        }



