package changevariable;

import kotlin.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameEngine {
    boolean cells[] = new boolean[3];
    Random random = new Random();
    int userChoice = 0;
    int userOtherChoice = 0;
    int userRightNotToChange = 0;
    int userRightToChange = 0;
    int masterShow = 0;
    boolean masterRightCell = false;
    List<Pair<Integer, Integer>> outList = new ArrayList<>();

    public List<Pair<Integer, Integer>> startGame(int parts, int loops){

        for (int i = 0; i < parts; i++) {

            userRightNotToChange = 0;
            // Student everytime not change the cell
            for (int j = 0; j < loops; j++) {
                masterRightCell = false;
                cleanTheCells();

                // Assign the right cell
                cells[random.nextInt(3)] = true;

                // Make the user chance
                userChoice = random.nextInt(3);

                // Capitan shows the other cell
                do {
                    masterShow = random.nextInt(3);
                    if (masterShow != userChoice && !cells[masterShow]){
                        masterRightCell = true;
                    }
                } while (!masterRightCell);

                // Student take the other cell than the first time


                if (cells[userChoice]){
                    userRightNotToChange++;
                }
            }

            // Student everytime change the cell
            userRightToChange = 0;
            for (int j = 0; j < loops; j++) {
                masterRightCell = false;
                cleanTheCells();
                cells[random.nextInt(3)] = true;

                userChoice = random.nextInt(3);

                do {
                    masterShow = random.nextInt(3);
                    if (masterShow != userChoice && !cells[masterShow]){
                        masterRightCell = true;
                    }
                } while (!masterRightCell);

                for (int k = 0; k < 3; k++) {
                    if (k != userChoice && k != masterShow){
                        userOtherChoice = k;
                    }
                }

                if (cells[userOtherChoice]){
                    userRightToChange++;
                }
            }

            outList.add(new Pair<>(userRightNotToChange, userRightToChange));
        }

        return outList;
    }

    private void cleanTheCells(){
        for (int i = cells.length - 1; i >= 0; i--) {
            cells[i] = false;
        }
    }
}
