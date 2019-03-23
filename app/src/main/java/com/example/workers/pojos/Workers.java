package com.example.workers.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Workers {
    @JsonProperty("ID")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("PHONE")
    private String phone;
    @JsonProperty("PASSWORD")
    private String password;
    @JsonProperty("SHOPID")
    private int shop_id;
    @JsonProperty("ISACTIVE")
    private int is_active;

}
