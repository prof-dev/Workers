package com.example.workers.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ShopExpenses {
    @JsonProperty("ID")
    private int id;
    @JsonProperty("workerid")
    private int worker_id;
    @JsonProperty("ID")
    private int expense_id;
    @JsonProperty("ID")
    private BigDecimal time;
    @JsonProperty("ID")
    private int shop_id;
}
