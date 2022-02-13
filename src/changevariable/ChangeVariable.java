package changevariable;

import kotlin.Pair;

import java.util.List;

public class ChangeVariable {

    public static void main(String[] args) {

        int parts = 10;
        int loops = 100;
        GameEngine gameEngine = new GameEngine();

        List<Pair<Integer, Integer>> statData = gameEngine.startGame(parts, loops);

        System.out.println("User not changed cell       User changed cell");
        for (Pair<Integer, Integer> data : statData ) {
            System.out.println(data.getFirst() + "                          " + data.getSecond());
        }
    }
}
