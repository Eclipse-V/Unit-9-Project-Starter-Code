public class Move{
    String name;
    int power;
    String type;
    private int accuracyPercentage;
    int level;
    
    public Move(String n, int p, String t, int a, int l){
      this.name = n;
      this.power = p;
      this.type = t;
      this.accuracyPercentage = a;
        this.level = l;
    }
  
    public int getPower(){
        /*int critHitRanNum = (int) (Math.random() * 4) + 1;
        double critChance = 0.0;
        if (level == 1){
          critChance = 0.0625;
        }
        else if(level == 2){
          critChance = 0.125;
        }
        else if(level == 3){
          critChance = 0.25;
        }
        else{
          critChance = 0.5;
        }*/
        int randomNum = (int) (Math.random() * 100) + 1;
        if(randomNum <= AccuracyPercentage()){
            if((double) (Math.random() * 1) + 1 < critChance){
                power *= 1.5;
                System.out.println("Critical hit!");
                System.out.println(this.name + "!");
                return this.power;
            }
            else{
                System.out.println(this.name + "!");
                return this.power;
            }
          }
        else{
            return System.out.println(name + " missed!");
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
