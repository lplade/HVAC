import java.util.Date;

public class WaterHeater extends ServiceCall{

    private double ageOfHeater;
    private static double CITY_FEE = 20.00;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, double ageOfHeater) {
        super(serviceAddress, problemDescription, date);
        this.ageOfHeater = ageOfHeater;
    }

    public double getAgeOfHeater() {
        return ageOfHeater;
    }

    public void setAgeOfHeater(double ageOfHeater) {
        this.ageOfHeater = ageOfHeater;
    }

    public String toString() {

        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);
        return String.format( "Water Heater service call\n" +
                "Service address: %s\n" +
                "Problem description: %s\n" +
                "Reported date: %s\n" +
                "Resolved date: %s\n" +
                "Resolution: %s\n" +
                "Fee: %s plus $%.2f city service fee\n",
                serviceAddress, problemDescription, reportedDate, resolvedDateString,
                resolutionString, feeString, CITY_FEE
        );
    }
}
