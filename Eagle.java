public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override 
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
            }
    }

    @Override
    public void ascend(int altitude) {
        this.altitude += altitude;
        System.out.printf("%s flies upward, altitude: %d%n", this.getName(), this.getAltitude());
    }

    @Override
    public void glide() {
        if (this.flying) {
            System.out.println("It glides into the air !!");
        }
    }

        @Override 
        public void descend(int altitude) {
            this.altitude -= altitude;
            System.out.printf("%s flies upward, altitude: %d%n", this.getName(), this.getAltitude());
        }

        @Override
        public void land() {
            if (this.altitude > 1) {
                System.out.printf("%s is too high, it can't lands%n", this.getName());
            }
            else{
                System.out.printf("%s lands on the ground%n", this.getName());
            }
        }
    }

