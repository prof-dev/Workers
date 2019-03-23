package com.example.workers.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class Work {
    @JsonProperty("ID")
    private int id;
    @JsonProperty("WORKERID")
    private int worker_id;
    @JsonProperty("SHOPID")
    private int shop_id;
    @JsonProperty("PRICE")
    private BigDecimal price;
    @JsonProperty("WORKTIME")
    private Date time;
}
