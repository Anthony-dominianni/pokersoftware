package Cards;

public enum Suit {
  SPADE (1),
  DIAMOND (2),
  CLUB (3),
  HEART (4);

  private int representative;

  private Suit(int representative) {
    this.representative = representative;
  }

  public int getValue() {
    return this.representative;
  }

}

