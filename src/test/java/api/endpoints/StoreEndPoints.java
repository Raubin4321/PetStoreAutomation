package api.endpoints;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import api.payload.Store;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//Created to perform Create, Read, Update, Delete requests for the user API

public class StoreEndPoints {

	public static Properties prop;
	public FileInputStream fis;

	static Properties getURL() {
		
		prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/routes.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

	public static Response createStoreOrder(Store payload) {
		
		String post_url = getURL().getProperty("post_url");

		Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).when()
				.post(post_url);

		return response;

	}

	public static Response readStoreOrder(int orderId) {
		
		String get_url = getURL().getProperty("get_url");

		Response response = given().pathParam("orderId", orderId).when().get(get_url);

		return response;

	}

	public static Response deleteStoreOrder(int orderId) {
		
		String delete_url = getURL().getProperty("delete_url");

		Response response = given().pathParam("orderId", orderId).when().delete(delete_url);

		return response;

	}

}
