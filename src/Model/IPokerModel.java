package Model;

import java.util.ArrayList;

public interface IPokerModel {

  //shuffles the deck
  ArrayList<Integer> shuffle();

  //Initializes a game
  void initGame(int players);

  //plays a round
  void playRound();

  //deals pre flop hand
  void dealPreFlop();

  //deals the Flop
  void dealFlop();

  //deals the Turn
  void dealTurn();

  //deals the river
  void dealRiver();

  //determines the winner
  void determineWinner();






}
