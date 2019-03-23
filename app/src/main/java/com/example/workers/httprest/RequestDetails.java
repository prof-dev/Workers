package com.example.workers.httprest;

import android.util.Base64;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

public class RequestDetails {

    private String url;
    private HttpMethod requestType;
    private HttpHeaders headers;


    public RequestDetails() {
        headers = new HttpHeaders();
        headers.add("Authorization", Base64.encodeToString("user:pass".getBytes(),Base64.DEFAULT));
    }

    public HttpHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(HttpHeaders headers) {
        this.headers = headers;
    }

    public RequestDetails(String url, HttpMethod requestType, String content) {
        super();
        this.url = url;
        this.requestType = requestType;
        headers = new HttpHeaders();
        headers.add("Authorization", Base64.encodeToString("user:pass".getBytes(),Base64.DEFAULT));
        if (content == "JSON") {
            headers.add("Content-Type", "APPLICATION/JSON");
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HttpMethod getRequestType() {
        return requestType;
    }

    public void setRequestType(HttpMethod requestType) {
        this.requestType = requestType;
    }

    @Override
    public String toString() {
        return "RequestDetails [url=" + url + ", requestType=" + requestType + "]";
    }
}