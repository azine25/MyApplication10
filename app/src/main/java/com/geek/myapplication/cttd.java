package com.geek.myapplication;

public class cttd {
    private String number;
    private String heading;
    private String description;
    private String data;

    public cttd(String number, String heading, String description, String data) {
        this.number = number;
        this.heading = heading;
        this.description = description;
        this.data = data;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getData() {
        return data;
    }

}
