package com.example.workers.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExpenseTypes {
    @JsonProperty("ID")
    private int id;
    @JsonProperty("NAME")
    private String name;
}
