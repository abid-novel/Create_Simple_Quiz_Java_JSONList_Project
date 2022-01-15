import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadAndDisplayGKQuesAndAns {
    public static void readAndDisplayQuesFile(int pos) throws IOException, ParseException {
        String fileName = "./src/main/resources/GeneralKnowledgeQuestionAndAnswer.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;

        //Read question from the json file
        JSONObject quesObject = (JSONObject) jsonArray.get(pos);
        String Question = (String) quesObject.get("Question");
        String Option1 =  (String) quesObject.get("Option1");
        String Option2 =  (String) quesObject.get("Option2");
        String Option3 =  (String) quesObject.get("Option3");
        String Option4 =  (String) quesObject.get("Option4");

        //print question
        System.out.println(Question);
        System.out.println(Option1);
        System.out.println(Option2);
        System.out.println(Option3);
        System.out.println(Option4);

    }


}
