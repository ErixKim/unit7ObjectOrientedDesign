import java.util.Scanner;
public class FillInQuestion extends Question
{
    //Override setText method to extract the answer from the question text
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        // We have to explicitly state that we want to invoke the superclass setText method
        super.setText(question);
        
        //We dont have to specify anything before setAnswer, but we could specify this or super
        this.setAnswer(answer);
    }
}
