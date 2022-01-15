import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class RunTheQuiz {
    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("Welcome to the Quiz");
        int pointCount = 0;
        for (int i=0; i<5; i++){
            int randomNumber = (int) Math.floor((Math.random() * 20));
            ReadAndDisplayGKQuesAndAns.readAndDisplayQuesFile(randomNumber);
            Scanner sc = new Scanner(System.in);
            System.out.println("Remember that everything is 'Case Sensative' ");
            System.out.println("Answer: ");
            String userAnswer = sc.next();

            String matchRealAnswer = ReadAndDisplayGKQuesAndAns.readAnswerOnly(randomNumber);

            if (matchRealAnswer.equals(userAnswer)){
                pointCount++;
            }

            else{
                pointCount = pointCount + 0;
            }
        }

        System.out.println("Your Total Point is = "+pointCount);

    }
}
