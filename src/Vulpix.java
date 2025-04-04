public class Vulpix extends Pokemon{
    public Vulpix(){
        super("Vulpix", 38, 41, 40, "Fire", new Move[]{
                    new Move("ember", 40, "Fire"), 
                    new Move("fire spin", 35, "Fire"),
                    new Move("inferno", 100, "Fire"),
                    new Move("quick attack", 40, "Normal")});
    }
}
