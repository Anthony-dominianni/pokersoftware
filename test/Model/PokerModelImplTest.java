package Model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PokerModelImplTest {

  IPokerModel model1 = new PokerModelImpl();
  IPokerModel model2 = new PokerModelImpl(1, 2, 0, 400);
  IPokerModel negSmall;
  IPokerModel negBig;
  IPokerModel negAnte;
  IPokerModel BBlessSB;
  IPokerModel SSlessBB;

  @Test
  public void shuffle() {
  }

  //Tests that incorrect starting parameters are caught
  @Test(expected = IllegalArgumentException.class)
  public void badBuild() {
    negSmall = new PokerModelImpl(-1, 3, 4, 0);
    negBig = new PokerModelImpl(1, -3, 0, 5);
    negAnte = new PokerModelImpl(1, 4, -1, 15);
    BBlessSB = new PokerModelImpl(2, 1, 0, 100);
    SSlessBB = new PokerModelImpl(5, 10, 0, 8);
  }

  public void playRound() {
  }

  public void dealPreFlop() {
  }

  public void dealFlop() {
  }

  public void dealTurn() {
  }

  public void dealRiver() {
  }

  public void determineWinner() {
  }
}