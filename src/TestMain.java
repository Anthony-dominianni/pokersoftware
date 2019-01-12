import Model.IPokerModel;
import Model.PokerModelImpl;

public class TestMain {

  public static void main(String[] args) {

    IPokerModel pokerModel = new PokerModelImpl();

    System.out.print(pokerModel.shuffle() + "\n");
    System.out.print(pokerModel.shuffle());
  }


}
