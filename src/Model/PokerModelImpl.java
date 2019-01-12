package Model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import Cards.Card;
import Player.Player;

// A class to represent a Texas Holdem Model
public class PokerModelImpl implements IPokerModel {

  private int smallBlind;
  private int bigBlind;
  private int ante;
  private int startingStack;
  private int pot;
  private int currentBet;
  private int numPlayers;
  private ArrayList<Card> deck;
  private ArrayList<Player> players;

  //default constructor
  public PokerModelImpl() {
    this.smallBlind = 2;
    this.bigBlind = 5;
    this.ante = 0;
    this.startingStack = 1000;
    this.pot = 0;
    this.currentBet = 0;
    this.numPlayers = 8;
    this.deck = new ArrayList<Card>(52);
    this.players = new ArrayList<Player>(numPlayers);
  }

  //Custom PokerModel
  //Takes a small blind, big blind, ante, and starting stack for all players
  public PokerModelImpl(int smallBlind, int bigBlind, int ante, int startingStack) {

    if (ensureBlinds(smallBlind, bigBlind, ante, startingStack)) {
      this.smallBlind = smallBlind;
      this.bigBlind = bigBlind;
      this.ante = ante;
      this.startingStack = startingStack;
    } else {
      throw new IllegalArgumentException("Invalid values for blinds or ante. " +
              "SB and BB must be > 0, BB must be > SB, ANTE must be >= 0, " +
              "and Starting stack must be > BB);");
    }
  }

  @Override
  public ArrayList<Integer> shuffle() {

    ArrayList<Integer> randomList = new ArrayList<>(52);
    for (int i = 1; i < 53; i++) {
      randomList.add(i);
    }

    ArrayList<Integer> deckOfCards = new ArrayList<>(52);

    int index = 0;

    while (randomList.size() > 0) {
      int randomNum = ThreadLocalRandom.current().nextInt(0, randomList.size());

      deckOfCards.add(index, randomList.get(randomNum));
      randomList.remove(randomNum);
      index++;
    }

    return deckOfCards;

  }

  @Override
  public void initGame(int players) {

  }

  @Override
  public String printgameState() {
    return null;
  }

  @Override
  public void playRound() {

  }

  @Override
  public void dealPreFlop() {

  }

  @Override
  public void dealFlop() {

  }

  @Override
  public void dealTurn() {

  }

  @Override
  public void dealRiver() {

  }

  @Override
  public void determineWinner() {

  }

  private static boolean ensureBlinds(int smallBlind, int bigBlind, int ante, int startingStack) {
    return smallBlind > 0 &&
            bigBlind > 0 &&
            ante >= 0 &&
            bigBlind > smallBlind &&
            startingStack > bigBlind;
  }
}
