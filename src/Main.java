public class Main {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel();
        wheel1.changeOfPositionForCenter(false);
        wheel1.aroundItsAxis();
        wheel1.speed(0);
        wheel1.wise(Direction.LEFT);
        Planet Earth = new Planet(75431268, 256, 6874);
        Earth.changeOfPositionForCenter(true);
        Earth.changeOfPositionForCenter(false);
        Earth.speed(0);
    }
}