public class Move{
    String name;
    int power;
    String type;
    private int accuracyPercentage;
    
    public Move(String n, int p, String t){
      this.name = n;
      this.power = p;
      this.type = t;
    }
  
    public int getPower(){
      System.out.println(this.name + "!");
      return this.power;
    }
    
    public String toString(){
      return this.name;
    }
  }