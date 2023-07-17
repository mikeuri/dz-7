package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("The previous planet for Mercury is: " + SolarSystem.MERCURY.previous);
        System.out.println("The previous planet for Jupiter is: " + SolarSystem.JUPITER.previous);
        System.out.println("The previous planet for Pluto is: " + SolarSystem.PLUTO.previous);
        System.out.println("-----------------------------------------------------");
        System.out.println("The distance from Mercury to the Sun is: "+ SolarSystem.MERCURY.sunDistance);
        System.out.println("The distance from Mars to the Sun is: "+ SolarSystem.MARS.sunDistance);
        System.out.println("The distance from Pluto to the Sun is: "+ SolarSystem.PLUTO.sunDistance);
        System.out.println("-----------------------------------------------------");
        System.out.println("The radius of Venus is: "+ SolarSystem.VENUS.radius);
        System.out.println("The radius of Earth is: "+ SolarSystem.EARTH.radius);
        System.out.println("-----------------------------------------------------");
        System.out.println("The position number of Mercury is: "+ SolarSystem.MERCURY.positionNumber);
        System.out.println("The position number of Earth is: "+ SolarSystem.EARTH.positionNumber);
        System.out.println("The position number of Pluto is: "+ SolarSystem.PLUTO.positionNumber);
        System.out.println("-----------------------------------------------------");
        System.out.println("The distance from Neptune to previous planet is: "+ SolarSystem.NEPTUNE.prevDistance);
        System.out.println("The distance from Uranus to previous planet is: "+ SolarSystem.URANUS.prevDistance);
        System.out.println("-----------------------------------------------------");
        System.out.println("The next planet for Mercury is: " + SolarSystem.MERCURY.next);
        System.out.println("The next planet for Neptune is: " + SolarSystem.NEPTUNE.next);
        System.out.println("The next planet for Pluto is: " + SolarSystem.PLUTO.next);
    }
}
