public class Vulpix extends Pokemon{
    public Vulpix(){
        super("Vulpix", 100, 41, 40, "Fire", 65, new Move[]{
                    new Move("ember", 40, "Fire", 100), 
                    new Move("fire spin", 35, "Fire", 85),
                    new Move("inferno", 100, "Fire", 50),
                    new Move("quick attack", 40, "Normal", 100)});
    }
}
