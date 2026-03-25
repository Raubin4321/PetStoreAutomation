package api.test;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.PetEndPoints;
import api.payload.pet.Category;
import api.payload.pet.Pet;
import api.payload.pet.Tag;
import api.utilities.ResponseUtility;
import io.restassured.response.Response;

public class PetTests {
	
	Faker faker;
	Pet petPayload;

	public Logger logger;
	
	@BeforeClass
	public void setUpData() {
		
		faker = new Faker();
		// Category
        Category category = new Category();
        category.setId(faker.number().randomDigit());
        category.setName(faker.animal().name());

        // Tag
        Tag tag = new Tag();
        tag.setId(faker.number().randomDigit());
        tag.setName(faker.dog().name());
        List<Tag> tagList = Arrays.asList(tag);
        
        //Pet
        petPayload = new Pet();
        petPayload.setId(faker.number().randomDigit());
        petPayload.setCategory(category);
        petPayload.setName(faker.dog().name());
        petPayload.setPhotoUrls(Arrays.asList(faker.internet().url()));
        petPayload.setTags(tagList);
        petPayload.setStatus("available");
        
        // logs
     	logger = LogManager.getLogger(this.getClass());

	}
	
	@Test(priority=1)
	public void testPostPet() {
		
		logger.info("********** Creating Pet **********");

		Response response = PetEndPoints.addPet(petPayload);
		response.then().log().all();
		
		// Save response
		ResponseUtility.saveResponseToFile(response, "createPet");

		Assert.assertEquals(response.getStatusCode(), 200);
		
		logger.info("********** Pet is created **********");
	}
	
	@Test(priority=2)
	public void testGetPetDetailsById() {
		
		logger.info("********** Reading Pet Info **********");

		Response response = PetEndPoints.getPetDetails(this.petPayload.getId());
		response.then().log().all();
		
		// Save response
		ResponseUtility.saveResponseToFile(response, "PetResponseById");
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		logger.info("********** Pet Info is displayed **********");
	}
	
	@Test(priority=3)
	public void testgetPetDetailsByStatus() {
		
		logger.info("********** Get Pet Info Using Status **********");
		
		Response response = PetEndPoints.getPetDetailsByStatus(this.petPayload.getStatus());
		response.then().log().all();
		
		// Save response
		ResponseUtility.saveResponseToFile(response, "PetResponseByStatus");
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		logger.info("********** Pet Info is displayed **********");

	}
	
	@Test(priority=4)
	public void testDeletePet() {
		
		logger.info("********** Deleting Pet **********");

		Response response = PetEndPoints.deletePet(this.petPayload.getId());
		
		// Save response
		ResponseUtility.saveResponseToFile(response, "DeletePet");
				
		Assert.assertEquals(response.getStatusCode(), 200);
		
		logger.info("********** Pet deleted **********");
	}

}
