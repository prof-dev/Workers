package com.example.workers.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class Work {
    @JsonProperty("ID")
    private int id;
    @JsonProperty("ID")
    private int worker_id;
    @JsonProperty("ID")
    private int shop_id;
    @JsonProperty("ID")
    private BigDecimal price;
    @JsonProperty("ID")
    private Date time;
}
