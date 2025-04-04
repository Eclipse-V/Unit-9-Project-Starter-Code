import java.lang.*;
public class Main {
  public static void main(String[] args) {
    Bulbasaur b = new Bulbasaur();
    Pidgey p = new Pidgey();

    Battle battle = new Battle(b, p);
    battle.start();
    }

  
  
}