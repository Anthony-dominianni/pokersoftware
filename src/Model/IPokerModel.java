package Model;

import java.util.ArrayList;

public interface IPokerModel {

  //shuffles the deck by creating a randomly sequenced array of 52 integers
  ArrayList<Integer> shuffle();

  //Initializes a game
  void initGame(int players);

  //prints the current state of the game
  String printgameState();

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
