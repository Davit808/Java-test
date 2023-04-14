public class Wheel implements Spinnable, ForItsAxis, DirectionOfRotation {
    private boolean around;

    @Override
    public void aroundItsAxis() {
        System.out.println("Wheel is can going or stop");
    }


    @Override
    public void speed(int speed) {
        if (speed != 0) {
            this.around = true;
            System.out.println(speed + "km/h");
        } else {
            this.around = false;
        }
    }

    @Override
    public void changeOfPositionForCenter(Boolean change) {
        if (change) {
            System.out.println("Wheel is deformation");
        } else {
            System.out.println("Wheel is good");
        }
    }

    @Override
    public void wise(Direction direction) {
        if (direction == Direction.LEFT) {
            System.out.println("Wheel spinning in " + Direction.LEFT);
        } else {
            System.out.println("Wheel spinning in " + Direction.RIGHT);
        }
    }
}
