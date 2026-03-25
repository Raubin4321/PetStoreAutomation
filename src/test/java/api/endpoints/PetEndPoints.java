package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.pet.Pet;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PetEndPoints {

	public static Response addPet(Pet payload) {
		
		Response response = given()
				.header("Content-Type","application/json")
				.accept(ContentType.JSON)
				.body(payload)
			.when()
				.post(Routes.pet_post_url);
		
		return response;
	}
	
	public static Response getPetDetails(int petId) {
		
		Response response = given()
				.pathParam("petId", petId)		
			.when()
				.get(Routes.pet_get_url);
		
		return response;
	}
	
	public static Response getPetDetailsByStatus(String status) {
		
		Response response = given()
				.queryParam("status", "available")
			.when()
				.get(Routes.pet_getBystatus_url);
		
		return response;
	}
	
	public static Response deletePet(int petId) {
		
		Response response = given()
				.pathParam("petId", petId)
			.when()
				.delete(Routes.pet_delete_url);
		
		return response;
	}
}
