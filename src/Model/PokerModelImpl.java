package Model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import Cards.Card;
import Player.Player;

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
  //Takes a small blind, big blind, ante, and startingstack for all players
  public PokerModelImpl(int smallBlind, int bigBlind, int ante, int startingStack) {
    this.smallBlind = smallBlind;
    this.bigBlind = bigBlind;
    this.ante = ante;
    this.startingStack = startingStack;
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
    }

    return deckOfCards;

  }

  @Override
  public void initGame(int players) {

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
}
