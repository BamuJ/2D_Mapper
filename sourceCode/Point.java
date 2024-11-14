package sourceCode;

public class Point{

    private double longitude;
    private double latitude;
    private double elevation;

    public Point(double longitude, double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double[] getLocation(){
        double[] location = {this.latitude, this.longitude};
        return location;
    }

    public double getElevation(){
        return this.elevation;
    }

    public void setElevation(double elevation){
        this.elevation = elevation;
    }

}