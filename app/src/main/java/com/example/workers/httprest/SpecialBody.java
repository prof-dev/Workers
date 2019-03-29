package com.example.workers.httprest;

public class SpecialBody {

    private int index;
    private String method;
    private String  table;
    private String body,satisfy,where;


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSatisfy() {
        return satisfy;
    }

    public void setSatisfy(String satisfy) {
        this.satisfy = satisfy;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }
}


