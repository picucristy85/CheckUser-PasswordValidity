public class User {
    String username;
    String password;



    public User(String username, String password, String confirmPassword) {
        checkUsernameLength(username);
        checkPassword(password);
        checkPasswordDigits(password);
        checkConfirmPassword(password, confirmPassword);

        this.username = username;
        this.password = password;


    }

    private static void checkConfirmPassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            System.out.println("Upsss! Parolele introduse nu coincid!");
        }
    }

    private static void checkPasswordDigits(String password) {
        char[] caracterePassword = password.toCharArray();
        int numarCifre = 0;
        for (char c : caracterePassword) {
            if (Character.isDigit(c)) {
                numarCifre++;
            }
        }
        if (numarCifre < 2) {
            System.out.println("Upsss! Parola trebuie sa contina minim 2 cifre!");
        }
    }

    private static void checkPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Upsss! Parola are mai putin de 8 caractere! Incercati din nou!");
        }
    }

    private static void checkUsernameLength(String username) {
        if (username.length() < 7) {
            System.out.println("Upsss! User-ul are mai putin de 7 caractere! Incercati din nou!");
        }
    }
}
