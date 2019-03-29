package com.example.workers.httprest;

import com.example.workers.pojos.Workers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;

public class HttpService {

    public HttpService() {
    }

    public String get(String tablename,String where ,boolean satisfy){
        GenericRestClient< ArrayList<SpecialBody>,String> restTemplate= new GenericRestClient< ArrayList<SpecialBody>, String>();
        try{
            ArrayList<SpecialBody> body=new ArrayList<>();
            SpecialBody s=new SpecialBody();
            s.setBody("");
            s.setIndex(0);
            s.setMethod("get");
            s.setSatisfy("all");
            s.setTable(tablename);
            s.setWhere(where);
            RequestDetails requestDetails=new RequestDetails();
            requestDetails.setUrl("http://www.prof-dev.com/workerWS.php/"+tablename);
            requestDetails.setRequestType(HttpMethod.POST);

            String response=restTemplate.execute(requestDetails, body);
            return response;
        }
        catch (Exception ex){
            System.out.println("ex"+ex.getMessage());
        }
    }
    public String post(String tablename,String body ){

    }
    public String put(String tablename,String id_column, String body){

    }
    public String delete(String tablename,String id_column){

    }
}
