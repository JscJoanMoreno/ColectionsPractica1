package Mobils;

import java.util.HashMap;
import java.util.Map;

public class MobileManager {
    HashMap<String, Mobile> mobileRegistry = new HashMap<>();

    // Add mobile
    public void addMobile(String dni, Mobile mobile) {
        if (!mobileRegistry.containsKey(dni)) {
            mobileRegistry.put(dni, mobile);
            System.out.println("Mobile added successfully.");
        } else {
            System.out.println("Error: DNI already exists.");
        }
    }

    // Remove mobile
    public void removeMobile(String dni) {
        if (mobileRegistry.containsKey(dni)) {
            mobileRegistry.remove(dni);
            System.out.println("Mobile removed successfully.");
        } else {
            System.out.println("Error: DNI not found.");
        }
    }

    // Find mobile by DNI
    public Mobile findMobileByDNI(String dni) {
        return mobileRegistry.getOrDefault(dni, null);
    }

    // Find DNI by mobile number
    public String findDNIByNumber(String number) {
        for (Map.Entry<String, Mobile> entry : mobileRegistry.entrySet()) {
            if (entry.getValue().getNumber().equals(number)) {
                return entry.getKey();
            }
        }
        return "Not found";
    }
}