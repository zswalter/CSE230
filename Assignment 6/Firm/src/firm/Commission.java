package firm;

public class Commission extends Hourly
{
    private double sales;
    private double comRate;
    
    public Commission (String eName, String eAddress,
            String ePhone, String socSecNumber, double rate, double commiRate)
    {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        
        comRate = commiRate;
    }
    
    public void addSales (double totalSales)
    {
        sales = totalSales;
    }
    
    public double pay()
    {
        double comission = (sales * comRate)/100;
        
        sales = 0;
        
        double payment = super.pay() + comission;
        
        return payment;
    }
    
    public String toString()
    {
        String result = super.toString();
        
        result += "\nTotal Sales: " + sales;
        
        return result;
    }
}
