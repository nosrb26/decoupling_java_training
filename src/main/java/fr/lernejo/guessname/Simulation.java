package fr.lernejo.guessname;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        long guess = player.askNextGuess();
        logger.log("You guess: " + guess);
        if (guess == numberToGuess) {
            logger.log("Congratulation you found the number !");
            return true;
        }
        else if (guess < numberToGuess) {
            player.respond(true);
        }
        else if (guess > numberToGuess) {
            player.respond(false);
        }
        return false;
    }

    public void loopUntilPlayerSucceed() {
        boolean loop = true;
        while (loop) {
            loop = !nextRound();
        }
    }
}
