import java.util.*;
public class Battle{
  Pokemon p1;
  Pokemon p2;

  public Battle(Pokemon p1, Pokemon p2){
    this.p1 = p1;
    this.p2 = p2;
  }

  public Move moveChoice(Pokemon p){
    Scanner input = new Scanner(System.in);
    System.out.println("Choose a move:");
    int i = 1;
    for(Move move:p.getMoveList()){
      System.out.println(i + ": " + move);
      i++;
    }
    int choice = input.nextInt();
    if(choice == 1){
      return p.getMoveList()[0];
    }
    else if(choice == 2){
      return p.getMoveList()[1];
    }
    else if(choice == 3){
      return p.getMoveList()[2];
    }
    else{
      return p.getMoveList()[3];
    }
  }

  public void turn(Pokemon a, Pokemon b){
    int damage = 0;
    System.out.println(a + "'s turn!");

        Move move = moveChoice(a);
        int power = move.getPower();
        int randomNum = (int) (Math.random() * 100) + 1;

        int critHitRanNum = (int) (Math.random() * 4) + 1;
        double critChance = 0.0;
        if (critHitRanNum == 1){
          critChance = 0.0625;
        }
        else if(critHitRanNum == 2){
          critChance = 0.125;
        }
        else if(critHitRanNum == 3){
          critChance = 0.25;
        }
        else{
          critChance = 0.5;
        }


        if (randomNum <= move.getAccuracyPercentage()){
          damage = (int)(power * ((double)a.getAttack())/b.getDefense());
          if((double) (Math.random() * 4) + 1 < critChance){
            damage *= 1.5;
            System.out.println("Critical hit!");
          }
          System.out.println(b + " took " + damage + " damage.");
          b.damage(damage);
          System.out.println(b + " has " + Math.max(b.getHp(), 0) + " hit points left."); 
        }
        else{
          System.out.println(move.getName() + " missed!");
        }
  }

  public void start(){
    System.out.println("A wild " + p2 + " has appeared! I choose you, " + p1);
    int turn = 0;
    while(p1.getHp() > 0 && p2.getHp() > 0){
      if(turn % 2 == 0){
        turn(p1, p2);
      }
      else{
        turn(p2, p1);
      }
        turn++;
    }
    if(p1.getHp() <= 0){
        System.out.println(p1 + " fainted! " + p2 + " wins!");
    }
    else{
      System.out.println(p2 + " fainted! " + p1 + " wins!");
    }
  }
}