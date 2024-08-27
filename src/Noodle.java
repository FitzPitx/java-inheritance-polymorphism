public class Noodle {
    double lengthInCentimeters;
    String shape;
    String texture = "brittle";

    public Noodle(double lengthInCentimeters, String shape, String ingredients){
        this.lengthInCentimeters = lengthInCentimeters;
        this.shape = shape;
        this.texture = ingredients;
    }

    public void cook(){
        this.texture = "cooked";
    }
}
