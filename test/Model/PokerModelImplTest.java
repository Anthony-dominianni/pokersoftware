package Model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class PokerModelImplTest {

  Random rand = new Random(42);

  IPokerModel model1 = new PokerModelImpl();
  IPokerModel model2 = new PokerModelImpl(1, 2, 0, 400);

  //Models for illegal argument catching
  IPokerModel negSmall;
  IPokerModel negBig;
  IPokerModel negAnte;
  IPokerModel BBlessSB;
  IPokerModel SSlessBB;

  //Tests the shuffle method
  @Test
  public void shuffle() {

  }

  //small blind is negative
  @Test(expected = IllegalArgumentException.class)
  public void badBuild() {
    negSmall = new PokerModelImpl(-1, 3, 4, 0);
  }

  //big blind is negative
  @Test(expected = IllegalArgumentException.class)
  public void badBuild2() {
    negBig = new PokerModelImpl(1, -3, 0, 5);
  }

  //ante is negative
  @Test(expected = IllegalArgumentException.class)
  public void badBuild3() {
    negAnte = new PokerModelImpl(1, 4, -1, 15);
  }

  //Big blind less than small blind
  @Test(expected = IllegalArgumentException.class)
  public void badBuild4() {
    BBlessSB = new PokerModelImpl(2, 1, 0, 100);
  }

  //Starting stack less than big blind
  @Test(expected = IllegalArgumentException.class)
  public void badBuild5() {
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