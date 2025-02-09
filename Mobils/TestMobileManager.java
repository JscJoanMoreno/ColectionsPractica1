package Mobils;

import java.util.Map;

public class TestMobileManager {
    public static void main(String[] args) {
        MobileManager manager = new MobileManager();

        manager.addMobile("12345678A", new Mobile("Samsung", "Galaxy S21", "666111222"));
        manager.addMobile("87654321B", new Mobile("Apple", "iPhone 13", "666333444"));
        manager.addMobile("11223344C", new Mobile("Xiaomi", "Redmi Note 10", "666555666"));

        System.out.println("\nList of all mobiles:");
        for (Map.Entry<String, Mobile> entry : manager.mobileRegistry.entrySet()) {
            System.out.println("DNI: " + entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nSearching mobile for DNI '12345678A':");
        System.out.println(manager.findMobileByDNI("12345678A"));

        System.out.println("\nSearching DNI for number '666333444':");
        System.out.println(manager.findDNIByNumber("666333444"));

        System.out.println("\nRemoving mobile with DNI '87654321B'");
        manager.removeMobile("87654321B");

        System.out.println("\nFinal list of mobiles:");
        for (Map.Entry<String, Mobile> entry : manager.mobileRegistry.entrySet()) {
            System.out.println("DNI: " + entry.getKey() + " - " + entry.getValue());
        }
    }
}

