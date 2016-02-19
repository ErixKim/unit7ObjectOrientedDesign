public class DriverLicense extends Card
{
    private String expirationYear;
    private String name = "";
    public DriverLicense(String n, String expirationYear)
    {
        super(n);
        name = n;
        this.expirationYear = expirationYear;
    }
    
    public String format()
    {
        String card = super.format();
        card += "\n" + "Card holder: " + this.name;
        return card;
        
    }
}
