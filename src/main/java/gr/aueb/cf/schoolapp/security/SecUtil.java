package gr.aueb.cf.schoolapp.security;

import org.mindrot.jbcrypt.BCrypt;

public class SecUtil {

    private SecUtil() {}

    //Encryption
    public static String hashPassword(String inputPassword) {
        int workload = 12;
        String salt = BCrypt.gensalt(workload);
        return BCrypt.hashpw(inputPassword,salt);
    }


    //Decryption
    public static boolean checkPassword(String inputPassword, String storedHashedPassword) {
        return BCrypt.checkpw(inputPassword, storedHashedPassword);
    }
}
