package com.example.workers.pojos;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class Shops {

    @JsonProperty("ID")
    private int id;
    @JsonProperty("NAME")
    private String name;
    @JsonProperty("ADDRSS")
    private String address;
    @JsonProperty("MANAGER")
    private int manager_id;
    @JsonProperty("ISACTIVE")
    private int is_active;
    @JsonProperty("ACTIVATIONDATE")
    private Date activation_date;
}
