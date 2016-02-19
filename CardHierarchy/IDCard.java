public class IDCard extends Card
{
    private String idNumber;
    public IDCard(String n, String id)
    {
        super(n);
        idNumber = id;
    }

    public String format()
    {
        String card = super.format();
        card += "\n" + "Card id number: " + this.idNumber;
        return card;
    }

//     public boolean equals(Object other)
//     {
//         //checks if this object and the other object are both instances of the same class
//         if (this.getClass() == other.getClass())
//         {
//             //since both objects are of instances of IDCard, it is okay to cast other to an IDCard
//             IDCard otherIDCard = (IDCard) other;
//             boolean isEqual = super.equals(otherIDCard);
//             return isEqual && idNumber.equals(otherIDCard.idNumber);
//         }
//         return false;
//     }
}
