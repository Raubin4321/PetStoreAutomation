package api.utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import io.restassured.response.Response;

public class ResponseUtility {
	
	public static void saveResponseToFile(Response response, String fileName) {

        String responseBody = response.getBody().prettyPrint();

        try {
            File file = new File(System.getProperty("user.dir") + "/responses/" + fileName + ".json");

            // Create directory if not exists
            //file.getParentFile().mkdirs();

            FileWriter writer = new FileWriter(file);
            writer.write(responseBody);
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
