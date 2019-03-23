package com.example.workers.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ShopExpenses {
    @JsonProperty("ID")
    private int id;
    @JsonProperty("WORKERID")
    private int worker_id;
    @JsonProperty("EXPENSEID")
    private int expense_id;
    @JsonProperty("TIME")
    private BigDecimal time;
    @JsonProperty("SHOPID")
    private int shop_id;
}
