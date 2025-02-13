package org.rituraj.java_method_practices.level3;

import java.util.HashSet;

public class OTPGenerator {

    public static String generateOTP() {
        int otp = (int) (Math.random() * 900000) + 100000;
        return String.valueOf(otp);
    }

    public static boolean validateUniqueOTPs(String[] otps) {
        HashSet<String> otpSet = new HashSet<>();
        for (String otp : otps) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] otps = new String[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        System.out.println("All OTPs are unique: " + validateUniqueOTPs(otps));
    }
}
