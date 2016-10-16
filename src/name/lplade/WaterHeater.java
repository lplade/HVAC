package name.lplade;

import java.util.Date;

class WaterHeater extends ServiceCall{

    private double ageOfHeater;
    private static double CITY_FEE = 20.00;

    WaterHeater(String serviceAddress, String problemDescription, Date date, double ageOfHeater) {
        super(serviceAddress, problemDescription, date);
        this.ageOfHeater = ageOfHeater;
    }

    public double getAgeOfHeater() {
        return ageOfHeater;
    }

    public void setAgeOfHeater(double ageOfHeater) {
        this.ageOfHeater = ageOfHeater;
    }

    @Override
    public String toString() {

        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : String.format("$%.2f", fee);
        String totalFeeString = (fee == UNRESOLVED) ? "Unresolved" : String.format("$%.2f", (fee + CITY_FEE));
        return String.format( "Water Heater service call\n" +
                "Service address: %s\n" +
                "Problem description: %s\n" +
                "Reported date: %s\n" +
                "Resolved date: %s\n" +
                "Resolution: %s\n" +
                "Fee: %s (%s plus $%.2f city service fee)\n",
                serviceAddress, problemDescription, reportedDate, resolvedDateString,
                resolutionString, totalFeeString, feeString, CITY_FEE
        );
    }
}
