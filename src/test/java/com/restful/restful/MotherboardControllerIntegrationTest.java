package com.restful.restful;

import com.restful.restful.model.Motherboard;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestfulApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MotherboardControllerIntegrationTest {
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port = 8080;

	private String getRootUrl() {
		return "http://localhost:" + port + "/api";
	}

	@Test
	public void contextLoads() {

	}
	@Test
	public void testGetAllMotherboard() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/motherboard",
				HttpMethod.GET, entity, String.class);
		System.out.println(response.getBody());
		assertNotNull(response.getBody());
	}

	@Test
	public void testGetMotherboardById() {
		int id = 11;
		Motherboard motherboard = restTemplate.getForObject(getRootUrl() + "/motherboard/" + id , Motherboard.class);
		System.out.println(motherboard.getName() + " " + motherboard.getPrice() + " " + motherboard.getSupported_memory());
		assertNotNull(motherboard);
	}

	@Test
	public void testCreateMotherboard() {
		Motherboard motherboard = new Motherboard();
		motherboard.setName("asus");
		motherboard.setSupported_memory("DDR4");
		motherboard.setPrice();

		ResponseEntity<Motherboard> postResponse = restTemplate.postForEntity(getRootUrl() + "/motherboard", motherboard, Motherboard.class);
		assertNotNull(postResponse);
		assertNotNull(postResponse.getBody());
	}

	@Test
	public void testUpdateMotherboard() {
		int id = 11;
		Motherboard motherboard = restTemplate.getForObject(getRootUrl() + "/motherboard/" + id, Motherboard.class);
		motherboard.setName("gigabyte");
		motherboard.setSupported_memory("DDR3");
		motherboard.setPrice();

		restTemplate.put(getRootUrl() + "/motherboard/" + id, motherboard);

		Motherboard updatedMotherboard = restTemplate.getForObject(getRootUrl() + "/motherboard/" + id, Motherboard.class);
		assertNotNull(updatedMotherboard);
		System.out.println(updatedMotherboard);
	}

	@Test
	public void testDeleteMotherboard() {
		int id = 17;
		Motherboard motherboard = restTemplate.getForObject(getRootUrl() + "/motherboard/" + id, Motherboard.class);
		assertNotNull(motherboard);

		restTemplate.delete(getRootUrl() + "/motherboard/" + id);

		try {
			motherboard = restTemplate.getForObject(getRootUrl() + "/motherboard/" + id, Motherboard.class);
		} catch (final HttpClientErrorException e) {
			assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
		}
	}
}
