public class Planet implements Spinnable, AroundAnotherBody, ForItsAxis {

    private int population;
    private int republic;
    private double maxHeight;

    public Planet(int population, int republic, double maxHeight) {
        this.population = population;
        this.republic = republic;
        this.maxHeight = maxHeight;
    }

    @Override
    public void aroundAnotherBody() {
        System.out.println("Rotates clockwise and counterclockwise");
    }

    @Override
    public void aroundItsAxis() {
        System.out.println("Rotates clockwise and counterclockwise");
    }

    @Override
    public void speed(int speed) {
        System.out.println("For its axis = 7,2921158553 * 10^-5 m/s");
        System.out.println("For center = 465,1013 m/s");
    }

    @Override
    public void changeOfPositionForCenter(Boolean change) {
        if (change) {
            System.out.println("the distance from the earth to the sun varies from 147 to 152.6 million kilometers");
        } else {
            System.out.println("cataclysms began");
        }
    }

    public int getPopulation() {
        return population;
    }

    public int getRepublic() {
        return republic;
    }

    public double getMaxHeight() {
        return maxHeight;
    }
}
