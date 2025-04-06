public class Move{
    String name;
    int power;
    String type;
    private int accuracyPercentage;
    int level;
    String[] types = {"Normal","Fighting","Flying","Poison","Ground","Rock","Bug","Ghost","Steel","Fire","Water","Grass","Electric","Psychic","Ice","Dragon","Dark","Fairy"};
    double[][] typeWeaknesses = {{1,2,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1},
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

    public Move(String n, int p, String t, int a, int l){
      this.name = n;
      this.power = p;
      this.type = t;
      this.accuracyPercentage = a;
      this.level = l;
    }
  
    public double critChance(){
      double critChance = 0.0;
        if (level == 1){
          critChance = 6.25;
        }
        else if(level == 2){
          critChance = 12.5;
        }
        else if(level == 3){
          critChance = 25;
        }
        else{
          critChance = 50;
        }
        return critChance;
    }

    public int getPower(){
      critChance();
        int randomNum = (int) (Math.random() * 100) + 1;
        if(randomNum <= accuracyPercentage){
            if((double) (Math.random() * 100) + 1 < critChance()){
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

    public double weakness(Pokemon other){
      int moveTypePosition = 0;
      int oppTypePosition = 0;

      for (int i = 0; i < types.length; i++){
        if(types[i].equals(this.type)){
          moveTypePosition = i;
        }
        if(types[i].equals(other.type)){
          oppTypePosition = i;
        }
      }
      return typeWeaknesses[oppTypePosition][moveTypePosition];
    }  

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
