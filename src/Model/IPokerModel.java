package Model;

import Player.Player;
import java.util.ArrayList;
import java.util.Random;

public interface IPokerModel {

  //prints the current state of the game
  String printgameState();

  //initializes the table of players to full stacks
  ArrayList<Player> initPlayers();

  //update the deck
  void Shuffle();

  //deals pre flop hand
  void dealHand();

  //deals the Flop
  void dealFlop();

  //deals the Turn
  void dealTurn();

  //deals the river
  void dealRiver();

  //determines the winner
  void determineWinner();






}
