package sourceCode;

public class Point{

    private double longitude;
    private double latitude;

    public Point(double longitude, double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double[] getLocation(){
        double[] location = {this.latitude, this.longitude};
        return location;
    }

}