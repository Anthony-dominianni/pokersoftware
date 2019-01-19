package Player;

public interface IPlayer {

  void receiveCards(int card1, int card2);

  void fold();

  void bet(int amt);

  void check();

  //prints the players hand
  String printState();


}
