package Prevalent;


import Model.Users;

public class Prevalent {
    public static Users currentOnlineUser;

    public static final String UserPhoneKey = "UserPhone";
    public static final String UserPasswordKey = "UserPassword";
    private static String phone;

    public static String phone() {
        return phone;
    }

    public static void setPhone(String phone) {
        Prevalent.phone = phone;
    }

    public static String getPhone() {
        return getPhone();
    }
}
