package com.example.democustomcontactlist;

public class contact {

    private String name;
    private Integer countrycode;
    private Integer phoneNum;

    public contact(String name, Integer countrycode, Integer phoneNum) {
        this.name = name;
        this.countrycode = countrycode;
        this.phoneNum = phoneNum;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getCountrycode() {
        return countrycode;
    }

    public void setCoutrycode(Integer coutrycode) {
        this.countrycode = coutrycode;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }
}
