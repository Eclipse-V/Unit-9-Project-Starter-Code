import java.util.*;
public class Battle{
  Pokemon p1;
  Pokemon p2;

  public Battle(Pokemon p1, Pokemon p2){
    this.p1 = p1;
    this.p2 = p2;
  }

  //allows the player to pick what move the pokemon should use
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
          damage = (int)(power * ((double)a.getAttack())/b.getDefense());
          damage *= move.weakness(b); //power multiplier depends on the other pokemon's weakeness to the current one's move type
          System.out.println(b + " took " + damage + " damage.");
          b.damage(damage);
          System.out.println(b + " has " + Math.max(b.getHp(), 0) + " hit points left."); 
  }

  public void start(){
    //checks to see which pokemon has the faster speed stat to make it have the first turn
    Pokemon fasterPokemon;
    Pokemon slowerPokemon;
    int speedOfFirstPokemon = p1.getSpeed();
    int speedOfSecPokemon = p2.getSpeed();
    if (speedOfFirstPokemon < speedOfSecPokemon){
      fasterPokemon = p2;
      slowerPokemon = p1;
    }
    else if (speedOfFirstPokemon > speedOfSecPokemon) {
      fasterPokemon = p1;
      slowerPokemon = p2;
    }
    else{
      fasterPokemon = p1;
      slowerPokemon = p2;
    }
    System.out.println("A wild " + p2 + " has appeared! I choose you, " + p1);
    int turn = 0;
    //game plays on until one dies
    while(p1.getHp() > 0 && p2.getHp() > 0){
      //swaps turns between the two pokemon
      if(turn % 2 == 0){
        turn(fasterPokemon, slowerPokemon);
      }
      else{
        turn(slowerPokemon, fasterPokemon);
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
