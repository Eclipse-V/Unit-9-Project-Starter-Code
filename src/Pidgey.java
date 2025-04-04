public class Pidgey extends Pokemon{
    public Pidgey(){
        super("Pidgey", 40, 10, 15, "Flying", new Move[] {
                        new Move("tackle", 8, "Normal", 100), 
                        new Move("gust", 10, "Flying", 100),
                        new Move("sand attack", 0, "Ground", 100),
                        new Move("quick attack", 4, "Normal", 100)});
      }
    }