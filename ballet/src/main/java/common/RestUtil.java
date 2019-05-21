package common;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestUtil {

	public static RestResponse callRest(String url, Object sentObject, HttpMethod httpMethod) {
		url = "http://localhost:8080/ballet" + url;
		url = url.replace("\\", "");
		RestTemplate restTemplate = new RestTemplate();
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		final HttpEntity<Object> requestEntity = new HttpEntity<Object>(sentObject, headers);
		RestResponse restResponse = null;
		ResponseEntity<RestResponse> reponseEntity = null;
		try {
			reponseEntity = restTemplate.exchange(url, httpMethod, requestEntity, RestResponse.class);
			restResponse = reponseEntity.getBody();
		} catch (Exception e) {
			restResponse = new RestResponse(0, e.getMessage(), null);
			e.printStackTrace();
		}
		return restResponse;
	}
	
}
