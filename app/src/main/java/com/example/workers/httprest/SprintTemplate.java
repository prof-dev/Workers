package com.example.workers.httprest;

import android.os.AsyncTask;
import android.util.Base64;

import com.example.workers.pojos.Workers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class SprintTemplate extends AsyncTask<String,Void, ResponseEntity<Workers>> {


    @Override
    protected ResponseEntity<Workers> doInBackground(String... uri) {
        final String url=uri[0];
        RestTemplate restTemplate=new RestTemplate();
        try{
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            HttpHeaders header=new HttpHeaders();
            String auth= "Jack"+":"+"password";
            String encodedAuth= Base64.encodeToString(auth.getBytes(),Base64.DEFAULT);
//            header.set("Authorization",encodedAuth);
            HttpEntity<String> entity=new HttpEntity<String>(header);
            ResponseEntity<Workers> response=restTemplate.exchange(url, HttpMethod.GET,entity,Workers.class);

            return response;

        }
        catch (Exception ex){

            return null;

        }
    }

    @Override
    protected void onPostExecute(ResponseEntity<Workers> workersResponseEntity) {
        super.onPostExecute(workersResponseEntity);
        HttpStatus status=workersResponseEntity.getStatusCode();
        Workers worker=workersResponseEntity.getBody();
    }
}
