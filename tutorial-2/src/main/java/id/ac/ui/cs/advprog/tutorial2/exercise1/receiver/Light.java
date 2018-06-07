package id.ac.ui.cs.advprog.tutorial2.exercise1.receiver;

public class Light {

    private static final String OUT_FMT = "%s light is %s";

    private String location;
    private boolean lit;

    public Light(String location) {
        this(location, false);
    }

    public Light(String location, boolean lit) {
        this.location = location;
        this.lit = lit;
    }

    public void on() {
        this.lit = true;
        System.out.println(String.format(OUT_FMT, location, "on"));
    }

    public void off() {
        this.lit = false;
        System.out.println(String.format(OUT_FMT, location, "off"));
    }

    public boolean isLit() {
        return lit;
    }

    public String getLocation() {
        return location;
    }
}
