package com.example.workers.pojos;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class Shops {

    @JsonProperty("ID")
    private int id;
    @JsonProperty("ID")
    private String name;
    @JsonProperty("ID")
    private String address;
    @JsonProperty("ID")
    private int manager_id;
    @JsonProperty("ID")
    private int is_active;
    @JsonProperty("ID")
    private Date activation_date;
}
