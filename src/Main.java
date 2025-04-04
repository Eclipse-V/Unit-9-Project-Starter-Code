import java.lang.*;
public class Main {
  public static void main(String[] args) {
    Bulbasaur b = new Bulbasaur();
    Vulpix v = new Vulpix();

    Battle battle = new Battle(b, v);
    battle.start();
    }

  
  
}