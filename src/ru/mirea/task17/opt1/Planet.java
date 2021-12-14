package ru.mirea.task17.opt1;


import java.util.Scanner;

public enum Planet {
        MERCURY (3.303e+23, 2.4397e6),
        VENUS   (4.869e+24, 6.0518e6),
        EARTH   (5.976e+24, 6.37814e6),
        MARS    (6.421e+23, 3.3972e6),
        JUPITER (1.9e+27,   7.1492e7),
        SATURN  (5.688e+26, 6.0268e7),
        URANUS  (8.686e+25, 2.5559e7),
        NEPTUNE (1.024e+26, 2.4746e7);

        private final double mass;   // в килограммах
        private final double radius; // в метрах
        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }
        private double mass() { return mass; }
        private double radius() { return radius; }

        // гравитационная постоянная
        public static final double G = 6.67300E-11;

        double surfaceGravity() {
            return G * mass / (radius * radius);
        }
        double surfaceWeight(double otherMass) {
            return otherMass * surfaceGravity();
        }
        public static void main(String[] args) {
            System.out.println("Input\n \tMERCURY\n" +
                    "\tVENUS\n" +
                    "\tEARTH\n" +
                    "\tMARS\n" +
                    "\tJUPITER\n" +
                    "\tSATURN\n" +
                    "\tURANUS\n" +
                    "\tNEPTUNE\nto get gravity value");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            if (line.equals("MERCURY"))
                System.out.println(MERCURY.surfaceGravity());
            if (line.equals("VENUS"))
                System.out.println(VENUS.surfaceGravity());
            if (line.equals("EARTH"))
                System.out.println(EARTH.surfaceGravity());
            if (line.equals("MARS"))
                System.out.println(MARS.surfaceGravity());
            if (line.equals("JUPITER"))
                System.out.println(JUPITER.surfaceGravity());
            if (line.equals("SATURN"))
                System.out.println(SATURN.surfaceGravity());
            if (line.equals("URANUS"))
                System.out.println(URANUS.surfaceGravity());
            if (line.equals("NEPTUNE"))
                System.out.println(NEPTUNE.surfaceGravity());
        }


}
