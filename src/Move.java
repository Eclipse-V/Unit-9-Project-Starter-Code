public class Move{
    String name;
    int power;
    String type;
    private int accuracyPercentage;
    int level;
    String[] types = {"Normal","Fighting","Flying","Poison","Ground","Rock","Bug","Ghost","Steel","Fire","Water","Grass","Electric","Psychic","Ice","Dragon","Dark","Fairy"};
    double[][] typeWeaknesses = {{1,2,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1}, //power multipliers depending on pokemon types
                                 {1,1,2,1,1,0.5,0.5,1,1,1,1,1,1,2,1,1,0.5,2},
                                 {1,0.5,1,1,0,2,0.5,1,1,1,1,0.5,2,1,2,1,1,1},
                                 {1,0.5,1,1,0,2,0.5,1,1,1,1,0.5,2,1,2,1,1,1},
                                 {1,1,1,0.5,1,0.5,1,1,1,1,2,2,0,1,2,1,1,1},
                                 {0.5,2,0.5,0.5,2,1,1,1,2,0.5,2,2,1,1,1,1,1,1},
                                 {1,0.5,2,1,0.5,2,1,1,1,2,1,0.5,1,1,1,1,1,1},
                                 {0,0,1,0.5,1,1,0.5,2,1,1,1,1,1,1,1,1,2,1},
                                 {0.5,2,0.5,0,2,0.5,0.5,1,0.5,2,1,0.5,1,0.5,0.5,0.5,1,0.5},
                                 {1,1,1,1,2,2,0.5,1,0.5,0.5,2,0.5,1,1,0.5,1,1,0.5},
                                 {1,1,1,1,1,1,1,1,0.5,0.5,0.5,2,2,1,0.5,1,1,1},
                                 {1,1,2,2,0.5,1,2,1,1,2,0.5,0.5,0.5,1,2,1,1,1},
                                 {1,1,0.5,1,2,1,1,1,0.5,1,1,1,0.5,1,1,1,1,1},
                                 {1,0.5,1,1,1,1,2,2,1,1,1,1,1,0.5,1,1,2,1},
                                 {1,2,1,1,1,2,1,1,2,2,1,1,1,1,0.5,1,1,1},
                                 {1,1,1,1,1,1,1,1,1,0.5,0.5,0.5,0.5,1,2,2,1,2},
                                 {1,2,1,1,1,1,0.5,0.5,1,1,1,1,1,0,1,1,0.5,2},
                                 {1,0.5,1,2,1,1,1,1,1,2,1,1,1,1,1,1,0,0.5,1}};
    
    public Move(String n, int p, String t){
      this.name = n;
      this.power = p;
      this.type = t;
      this.accuracyPercentage = 100;
      this.level = 1;
    }

    public Move(String n, int p, String t, int a){
      this.name = n;
      this.power = p;
      this.type = t;
      this.accuracyPercentage = a;
    }
  
    //depending on the level of the Pokemon's move, increases chances to get a crit hit
    public double critChance(){
      int randomLevel = (int) (Math.random() * 4) + 1;
      double critChance = 0.0;
        if (randomLevel == 1){
          critChance = 6.25;
        }
        else if(randomLevel == 2){
          critChance = 12.5;
        }
        else if(randomLevel == 3){
          critChance = 25;
        }
        else if(randomLevel == 4){
          critChance = 50;
        }
        return critChance;
    }

    public int getPower(){
      critChance();
      //checks the accuracy rate of the pokemon's move 
      //deals zero damage if it misses
        int randomNum = (int) (Math.random() * 100) + 1;
        if(randomNum <= accuracyPercentage){
            if((double) (Math.random() * 100) + 1 < critChance()){ //if it's a crit hit, multiplies the power by 1.5
                power *= 1.5;
                System.out.println(this.name + "!" + " It's a critical hit!");
            }
            else{
                System.out.println(this.name + "!");
            }
          }
        else{
            System.out.println(this.name + " missed!");
            power = 0;
        }
        return power;
    }

  //checks the weakness type of the other pokemon to the move type
    public double weakness(Pokemon other){
      int moveTypePosition = 0;
      int oppTypePosition = 0;

      for (int i = 0; i < types.length; i++){
        if(types[i].equals(this.type)){
          moveTypePosition = i;
        }
        if(types[i].equals(other.getType())){
          oppTypePosition = i;
        }
      }
      return typeWeaknesses[oppTypePosition][moveTypePosition];
    }  

    //getters
    public int getAccuracyPercentage(){
      return this.accuracyPercentage;
    }

    public String getName(){
      return this.name;
    }

    public String getMoveType(){
      return this.type;
    }


    public String toString(){
      return this.name;
    }
  }
