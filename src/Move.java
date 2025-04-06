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
    
    public Move(String n, int p, String t, int a, int l){
      this.name = n;
      this.power = p;
      this.type = t;
      this.accuracyPercentage = a;
      this.level = l;
    }
  
    public int getPower(){
        int critHitRanNum = (int) (Math.random() * 4) + 1;
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
        int randomNum = (int) (Math.random() * 100) + 1;
        if(randomNum <= accuracyPercentage){
            if((double) (Math.random() * 100) + 1 < critChance){
                power *= 1.5;
                System.out.println(this.name + "!" + " It's a critical hit!");
                return this.power;
            }
            else{
                System.out.println(this.name + "!");
                return this.power;
            }
          }
        else{
            System.out.println(this.name + " missed!");
            return 0;
        }
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
