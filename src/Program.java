import com.google.gson.Gson;
import com.sun.xml.internal.bind.api.impl.NameConverter;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) throws IOException {

        AutomationSettings as = new AutomationSettings();
        String file = "file1.text";
        String jsonFile = "file1.json";

        Program p = new Program();
        p.seriliazeToFile(as, file);
        p.seriliazeToJSONFile(as, jsonFile);

        //AutomationSettings as1 = p.deserializeTxtToObject(file,as1);

    }
    public void seriliazeToFile(Object obj, String fileName) throws IOException{

        FileOutputStream fileOStream = new FileOutputStream(fileName);
        ObjectOutputStream oOStream = new ObjectOutputStream(fileOStream);

        oOStream.writeObject(obj);
        oOStream.close();
        fileOStream.close();
    }

    public void seriliazeToJSONFile(Object obj, String fileName) throws IOException{
        Gson gs = new Gson();
        String jsonObject = gs.toJson(obj);

        FileOutputStream fileOStream = new FileOutputStream(fileName);
        ObjectOutputStream oOStream = new ObjectOutputStream(fileOStream);

        oOStream.writeObject(jsonObject);
        oOStream.close();
        fileOStream.close();
    }

    public void serializeToJSONFileWithEncoding(Object obj, String fileName){

    }

    public void deserializeTxtToObject(String fileName, Object objType) throws IOException{
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream objInStream = new ObjectInputStream(file);

        //objType = (objType.getClass();) objInStream.readObject();
    }
}
class AutomationSettings implements Serializable {
    String url = "https://www.js.com";
    int minTimeOut = 60;
    int maxTimeOut = 120;
}
