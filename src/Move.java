public class Move{
    String name;
    int power;
    String type;
    private int accuracyPercentage;
    
    public Move(String n, int p, String t, int a){
      this.name = n;
      this.power = p;
      this.type = t;
      this.accuracyPercentage = a;
    }
  
    public int getPower(){
      System.out.println(this.name + "!");
      return this.power;
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

    public void criticalHit(){
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
    }

    public String toString(){
      return this.name;
    }
  }