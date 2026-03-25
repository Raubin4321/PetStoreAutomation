package api.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.StoreEndPoints;
import api.payload.store.Store;
import io.restassured.response.Response;

public class StoreTests {

	Faker faker;
	Store storePayload;

	public Logger logger; // For logs

	@BeforeClass
	public void setupData() {

		faker = new Faker();
		storePayload = new Store();

		storePayload.setId(faker.number().numberBetween(1, 10));
		storePayload.setPetId(faker.number().numberBetween(1, 10));
		storePayload.setQuantity(faker.number().numberBetween(1, 10));
		
		Date date = faker.date().future(5, java.util.concurrent.TimeUnit.DAYS);
		storePayload.setShipDate(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
                .format(date));

		// logs
		logger = LogManager.getLogger(this.getClass());

	}

	@Test(priority = 1)
	public void testPostStoreOrder() {
		
		logger.info("********** Creating Store Order **********");

		Response response = StoreEndPoints.createStoreOrder(storePayload);
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);
		
		logger.info("********** Store Order is created **********");

	}

	@Test(priority = 2)
	public void testGetStoreOrderById() {
		
		logger.info("********** Reading Store Order Info **********");

		Response response = StoreEndPoints.readStoreOrder(this.storePayload.getId());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		logger.info("********** Store Order Info is displayed **********");

	}

	@Test(priority = 3)
	public void testDeleteStoreOrderById() {
		
		logger.info("********** Deleting Store **********");

		Response response = StoreEndPoints.deleteStoreOrder(this.storePayload.getId());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		logger.info("********** Store Order deleted **********");

	}

}
