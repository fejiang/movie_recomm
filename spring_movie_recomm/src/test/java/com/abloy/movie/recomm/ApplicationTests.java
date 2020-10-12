package com.abloy.movie.recomm;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.databind.node.ObjectNode;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationTests {

	@LocalServerPort
	private int port;
	
	private String urlBase;
	
	@Autowired
	private TestRestTemplate template;
	
	@BeforeEach
    public void setUp() throws Exception {
        this.urlBase = "http://localhost:" + port;
    }
	
	@Test
	public void getMovieRecomm() {
		String userId = "1";
		ResponseEntity<ObjectNode> response = this.template.getForEntity(
				urlBase +  "/movierecomm/" + userId, ObjectNode.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getHeaders().getContentType()).isEqualTo(
				MediaType.APPLICATION_JSON);
	}

}


