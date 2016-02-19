public class CallingCard extends Card
{
    private String cardNumber;
    private String pin;
    public CallingCard(String n, String cardNumber, String pin)
    {
        super(n);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }
    public String format()
    {
        String card = super.format();
        card += "\n" + "Card number: " + this.cardNumber;
        card += "\n" + "Card pin: " + this.pin;
        return card;
    }
}
