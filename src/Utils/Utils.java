package Utils;

import java.util.ArrayList;
import java.util.Random;

public class Utils {

  public Utils(){}

  //This function takes a Random object for testing purposes
  public ArrayList<Integer> shuffle(Random rand) {

    ArrayList<Integer> randomList = new ArrayList<>(52);
    for (int i = 1; i < 53; i++) {
      randomList.add(i);
    }

    ArrayList<Integer> deckOfCards = new ArrayList<>(52);

    int index = 0;

    while (randomList.size() > 0) {
      int randomNum = rand.nextInt(randomList.size());

      deckOfCards.add(index, randomList.get(randomNum));
      randomList.remove(randomNum);
      index++;
    }

    return deckOfCards;
  }
}
