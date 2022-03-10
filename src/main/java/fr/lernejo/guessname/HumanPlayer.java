package fr.lernejo.guessname;
import fr.lernejo.logger.*;
import java.util.Scanner;

public class HumanPlayer implements Player {
    public final Logger logger = LoggerFactory.getLogger("Player");
    public Scanner console = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        long result = console.nextLong();
        console.nextLine();
        return result;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater) {
            logger.log("The number is greater");
        }
        else {
            logger.log("The number is lower");
        }
    }
}
