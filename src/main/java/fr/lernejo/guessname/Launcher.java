package fr.lernejo.guessname;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        Simulation simulation = new Simulation(new HumanPlayer());
        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextInt(100);
        simulation.initialize(randomNumber);
        simulation.loopUntilPlayerSucceed();
    }
}
