package com.iot.ssm.po;

public class Person {
    private Integer personId;

    private String personName;

    private String personAdress;

    private String personTel;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getPersonAdress() {
        return personAdress;
    }

    public void setPersonAdress(String personAdress) {
        this.personAdress = personAdress == null ? null : personAdress.trim();
    }

    public String getPersonTel() {
        return personTel;
    }

    public void setPersonTel(String personTel) {
        this.personTel = personTel == null ? null : personTel.trim();
    }
}