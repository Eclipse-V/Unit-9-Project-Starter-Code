import java.lang.*;
public class Main {
  public static void main(String[] args) {
    Hattrem h = new Hattrem();
    Vulpix v = new Vulpix();

    Battle battle = new Battle(h, v);
    battle.start();
    }

  
  
}