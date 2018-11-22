package geco;

public class PasswordGeneration {

    private static String generate(int length) {
        String chars = "a";
        StringBuilder pass = new StringBuilder(length);
        for (int x = 0; x < length; x++) {
            int i = (int) (Math.random() * chars.length());
            pass.append(chars.charAt(i));
        }
        return pass.toString();
    }

    public String getRandomPassword(){

        String result = generate(8);
        return result;
    }
}
