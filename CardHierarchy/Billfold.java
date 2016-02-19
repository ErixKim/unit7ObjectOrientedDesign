public class Billfold
{
    private String card1;
    private String card2;
    
    public void addCard(String newCard)
    {
        if (card1 == null)
        {
            card1 = newCard;
        }
        else if(card2 == null)
        {
            card2 = newCard;
        }
        else
        {
            
        }
    }
    
    public String formatCards()
    {
        String card = "";
        card += card1 + "|" + card2;
        return card;
    }
}
