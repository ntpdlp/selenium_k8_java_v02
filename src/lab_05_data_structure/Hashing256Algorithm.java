package lab_05_data_structure;


import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//Some Java Hashing Algorithm 'Security Hashing Algorithm': SHA-1, SHA-256, SHA-512
class Hashing256Algorithm {
    public static String sha256(String input){
        //SHA-256 provided by MessageDigest class
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(input.getBytes(StandardCharsets.UTF_8));

            StringBuilder outputHex = new StringBuilder();
            for(byte b:hash){
                String hexStr = Integer.toHexString(0xff & b);
                if (hexStr.length() == 1){
                    outputHex.append('0');
                }
                outputHex.append(hexStr);
            }
            return outputHex.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        System.out.println("SHA-256 Hash: " + sha256("Hello, world"));
        //SHA-256 Hash: 4ae7c3b6ac0beff671efa8cf57386151c06e58ca53a78d83f36107316cec125f
    }

}
