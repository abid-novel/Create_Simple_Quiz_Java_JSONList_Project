import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONArrayList {
    public static void writeGeneralKnowledgeQues() throws IOException, ParseException {
        String fileName ="./src/main/resources/GeneralKnowledgeQuestionAndAnswer.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));

        //Creating question object
        JSONObject QuesObj1 = new JSONObject();
        JSONObject QuesObj2 = new JSONObject();
        JSONObject QuesObj3 = new JSONObject();
        JSONObject QuesObj4 = new JSONObject();
        JSONObject QuesObj5 = new JSONObject();
        JSONObject QuesObj6 = new JSONObject();
        JSONObject QuesObj7 = new JSONObject();
        JSONObject QuesObj8 = new JSONObject();
        JSONObject QuesObj9 = new JSONObject();
        JSONObject QuesObj10 = new JSONObject();
        JSONObject QuesObj11 = new JSONObject();
        JSONObject QuesObj12 = new JSONObject();
        JSONObject QuesObj13 = new JSONObject();
        JSONObject QuesObj14 = new JSONObject();
        JSONObject QuesObj15 = new JSONObject();
        JSONObject QuesObj16 = new JSONObject();
        JSONObject QuesObj17 = new JSONObject();
        JSONObject QuesObj18 = new JSONObject();
        JSONObject QuesObj19 = new JSONObject();
        JSONObject QuesObj20 = new JSONObject();

        //Input value & property for the individual object
        QuesObj1.put("Question","What is the capital city of Bangladesh?");
        QuesObj1.put("Option1","Mymensingh");
        QuesObj1.put("Option2","Rangpur");
        QuesObj1.put("Option3","Dhaka");
        QuesObj1.put("Option4","Cumilla");
        QuesObj1.put("Answer","Dhaka");
        JSONArray jsonArray = (JSONArray) obj;
        jsonArray.add(QuesObj1);

        QuesObj2.put("Question","What is the national language of Bangladesh?");
        QuesObj2.put("Option1","Bangla");
        QuesObj2.put("Option2","English");
        QuesObj2.put("Option3","Hindi");
        QuesObj2.put("Option4","Urdu");
        QuesObj2.put("Answer","Bangla");
        jsonArray.add(QuesObj2);

        QuesObj3.put("Question","How many seasons does Bangladesh normally experience?");
        QuesObj3.put("Option1","Seven");
        QuesObj3.put("Option2","Ten");
        QuesObj3.put("Option3","Two");
        QuesObj3.put("Option4","Six");
        QuesObj3.put("Answer","Six");
        jsonArray.add(QuesObj3);

        QuesObj4.put("Question","How many seasons does Bangladesh normally experience?");
        QuesObj4.put("Option1","Seven");
        QuesObj4.put("Option2","Ten");
        QuesObj4.put("Option3","Two");
        QuesObj4.put("Option4","Six");
        QuesObj4.put("Answer","Six");
        jsonArray.add(QuesObj4);

        QuesObj5.put("Question","What is the currency of Bangladesh?");
        QuesObj5.put("Option1","Euro");
        QuesObj5.put("Option2","Rupee");
        QuesObj5.put("Option3","Dollar");
        QuesObj5.put("Option4","Taka");
        QuesObj5.put("Answer","Taka");
        jsonArray.add(QuesObj5);

        QuesObj6.put("Question","On which river Dhaka is situated?");
        QuesObj6.put("Option1","Buriganga");
        QuesObj6.put("Option2","Jamuna ");
        QuesObj6.put("Option3","Meghna");
        QuesObj6.put("Option4","Padma");
        QuesObj6.put("Answer","Buriganga");
        jsonArray.add(QuesObj6);

        QuesObj7.put("Question","Bangladesh is bordered by two countries.Which ones?");
        QuesObj7.put("Option1","Nepal and Bhutan");
        QuesObj7.put("Option2","India and Nepal");
        QuesObj7.put("Option3","India and Myanmar");
        QuesObj7.put("Option4","Myanmar and Nepal");
        QuesObj7.put("Answer","India and Myanmar");
        jsonArray.add(QuesObj7);

        QuesObj8.put("Question","On which continent is Bangladesh located?");
        QuesObj8.put("Option1","Africa ");
        QuesObj8.put("Option2","South America");
        QuesObj8.put("Option3","Europe");
        QuesObj8.put("Option4","Asia");
        QuesObj8.put("Answer","Asia");
        jsonArray.add(QuesObj8);

        QuesObj9.put("Question","What is the main religion practiced in Bangladesh?");
        QuesObj9.put("Option1","Islam");
        QuesObj9.put("Option2","Hinduism");
        QuesObj9.put("Option3","Buddhism");
        QuesObj9.put("Option4","Other");
        QuesObj9.put("Answer","Islam");
        jsonArray.add(QuesObj9);

        QuesObj10.put("Question","Which of these is a common mode of transport in Bangladeshi cities?");
        QuesObj10.put("Option1","Rickshaw");
        QuesObj10.put("Option2","Elephant");
        QuesObj10.put("Option3","Toboggan");
        QuesObj10.put("Option4","Tram");
        QuesObj10.put("Answer","Rickshaw");
        jsonArray.add(QuesObj10);

        QuesObj11.put("Question","What year did Bangladesh finally become independent and gain the name it has today?");
        QuesObj11.put("Option1","1952");
        QuesObj11.put("Option2","1975");
        QuesObj11.put("Option3","1971");
        QuesObj11.put("Option4","1988");
        QuesObj11.put("Answer","1971");
        jsonArray.add(QuesObj11);

        QuesObj12.put("Question","Which of these is a main export of Bangladesh?");
        QuesObj12.put("Option1","Textiles");
        QuesObj12.put("Option2","Cars ");
        QuesObj12.put("Option3","Coffee");
        QuesObj12.put("Option4","Cuckoo clocks");
        QuesObj12.put("Answer","Textiles");
        jsonArray.add(QuesObj12);

        QuesObj13.put("Question","Which of the following is the processing unit of the computer?");
        QuesObj13.put("Option1","Memory");
        QuesObj13.put("Option2","Graphic Card ");
        QuesObj13.put("Option3","Mother Board");
        QuesObj13.put("Option4","CPU");
        QuesObj13.put("Answer","CPU");
        jsonArray.add(QuesObj13);

        QuesObj14.put("Question","Which of these folders in Gmail will contain the emails which are composed but not yet sent?");
        QuesObj14.put("Option1","Inbox");
        QuesObj14.put("Option2","Sent");
        QuesObj14.put("Option3","Spam");
        QuesObj14.put("Option4","Drafts");
        QuesObj14.put("Answer","Drafts");
        jsonArray.add(QuesObj14);

        QuesObj15.put("Question","What is the national game of Bangladesh?");
        QuesObj15.put("Option1","Cricket");
        QuesObj15.put("Option2","Kabadi");
        QuesObj15.put("Option3","Hockey");
        QuesObj15.put("Option4","Football");
        QuesObj15.put("Answer","Kabadi");
        jsonArray.add(QuesObj15);

        QuesObj16.put("Question","Kazi Nazrul Islam is Associated with?");
        QuesObj16.put("Option1","Poetry");
        QuesObj16.put("Option2","Politics");
        QuesObj16.put("Option3","Hockey");
        QuesObj16.put("Option4","Cricket");
        QuesObj16.put("Answer","Poetry");
        jsonArray.add(QuesObj16);

        QuesObj17.put("Question","How many districts are there in Bangladesh?");
        QuesObj17.put("Option1","68");
        QuesObj17.put("Option2","69");
        QuesObj17.put("Option3","96");
        QuesObj17.put("Option4","64");
        QuesObj17.put("Answer","64");
        jsonArray.add(QuesObj17);

        QuesObj18.put("Question","The first case of novel coronavirus was identified in?");
        QuesObj18.put("Option1","Beijing");
        QuesObj18.put("Option2","Shanghai");
        QuesObj18.put("Option3","Wuhan");
        QuesObj18.put("Option4","Tianjin");
        QuesObj18.put("Answer","Wuhan");
        jsonArray.add(QuesObj18);

        QuesObj19.put("Question","When was COVID-19 first reported?");
        QuesObj19.put("Option1","2020");
        QuesObj19.put("Option2","2019");
        QuesObj19.put("Option3","2021");
        QuesObj19.put("Option4","2018");
        QuesObj19.put("Answer","2019");
        jsonArray.add(QuesObj19);

        QuesObj20.put("Question","What is the right answer: 7*51*0*255");
        QuesObj20.put("Option1","5369");
        QuesObj20.put("Option2","7105");
        QuesObj20.put("Option3","0");
        QuesObj20.put("Option4","1");
        QuesObj20.put("Answer","0");
        jsonArray.add(QuesObj20);

        //write the JSON list
        FileWriter fw = new FileWriter(fileName);
        fw.write(jsonArray.toJSONString());
        fw.flush();
        fw.close();



    }
}
