public class Pidgey extends Pokemon{
    public Pidgey(){
        super("Pidgey", 40, 45, 40, "Flying", 56, new Move[] {
                        new Move("tackle", 8, "Normal", 100, 1), 
                        new Move("gust", 10, "Flying", 100, 4),
                        new Move("sand attack", 0, "Ground", 100, 1),
                        new Move("quick attack", 4, "Normal", 100, 3)});
      }
    }