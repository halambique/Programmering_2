public class Planet {
    private String planetName;
    private float radius;
    private double mass;


    public Planet(String planetName, float radius, double mass) {
        this.planetName = planetName;
        this.radius = radius;
        this.mass = mass;
    }

    public String getName() {
        return planetName;
    }

    public void setName(String planetName) {
        this.planetName = planetName;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getMass(){
        return mass;
    }


}

