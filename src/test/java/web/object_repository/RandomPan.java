package web.object_repository;
import java.util.Random;

public class RandomPan {
        public static void main(String[] args) {
            // Call the method to generate a random PAN number
            String randomPAN = generateRandomPAN();
            System.out.println("Random PAN number: " + randomPAN);
        }

        public static String generateRandomPAN() {
            // Randomly generate 5 uppercase letters
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                char randomLetter = (char) (random.nextInt(26) + 'A');
                sb.append(randomLetter);
            }

            // Randomly generate 4 digits
            for (int i = 0; i < 4; i++) {
                int randomDigit = random.nextInt(10);
                sb.append(randomDigit);
            }

            // Randomly generate 1 uppercase letter
            char randomLetter = (char) (random.nextInt(26) + 'A');
            sb.append(randomLetter);

            // Return the generated PAN number
            return sb.toString();
        }
}
