package com.picolab.Domain;

import com.picolab.util.InvalidParamException;

public class Canvas {

    private Integer id;
    private String url;
    private boolean isAssigned;
    private static int COUNTER = 1;

    public Canvas(){}

    public Canvas(String url) throws InvalidParamException {
        if (url == null || url.equals(""))
            throw new InvalidParamException();

        this.url = url;
        this.id = COUNTER;
        this.isAssigned = false;
        ++COUNTER;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean getIsAssigned() {
        return isAssigned;
    }

    public void setIsAssigned(boolean assigned) {
        isAssigned = assigned;
    }
}
