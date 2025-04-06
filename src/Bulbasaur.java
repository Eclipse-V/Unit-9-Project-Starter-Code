public class Bulbasaur extends Pokemon{
  
    public Bulbasaur(){
      super("Bulbasaur", 40, 49, 49, "Grass", 45, new Move[] {
                      new Move("tackle", 8, "Normal", 100, 3), 
                      new Move("tail whip", 0, "Normal", 100, 1),
                      new Move("vine whip", 10, "Grass", 100, 2),
                      new Move("bite", 10, "Normal", 100, 2)});
    }
  
  }