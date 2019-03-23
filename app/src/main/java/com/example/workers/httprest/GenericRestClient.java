package com.example.workers.httprest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

public class GenericRestClient<T, V> {

    private RestTemplate restTemplate = new RestTemplate();

    public V execute(RequestDetails requestDetails, T data, ResponseErrorHandler errorHandler,
                     Class<V> genericClass, HttpHeaders headers) throws ResourceAccessException, Exception {

        restTemplate.setErrorHandler(errorHandler);



//		headers.add("Content-Type", "APPLICATION/JSON");
        HttpEntity<T> entity = new HttpEntity<T>(data, headers);
        ResponseEntity<V> response = restTemplate.exchange(requestDetails.getUrl(), requestDetails.getRequestType(),
                entity, genericClass);
        return response.getBody();
    }

}