import javax.swing.JOptionPane;
import java.security.SecureRandom;

public class passwordGenerator {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+";

    public static String generatePassword(int length) {
        String allCharacters = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(randomIndex));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        int passwordLength = Integer.parseInt(JOptionPane.showInputDialog("Enter the Length of the password:"));
        
        System.out.print("Enter the length of the password: ");
        String generatedPassword = generatePassword(passwordLength);
        JOptionPane.showMessageDialog(null, "Generated Password: " + generatedPassword);
    }
}
