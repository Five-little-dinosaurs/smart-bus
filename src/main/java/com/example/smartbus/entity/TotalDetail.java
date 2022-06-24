package com.example.smartbus.entity;


public class TotalDetail {

  private int id;
  private String temperature;
  private String humidity;
  private String people;
  private String detail;
  private int dstatus;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getTemperature() {
    return temperature;
  }

  public void setTemperature(String temperature) {
    this.temperature = temperature;
  }


  public String getHumidity() {
    return humidity;
  }

  public void setHumidity(String humidity) {
    this.humidity = humidity;
  }


  public String getPeople() {
    return people;
  }

  public void setPeople(String people) {
    this.people = people;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }


  public int getDstatus() {
    return dstatus;
  }

  public void setDstatus(int dstatus) {
    this.dstatus = dstatus;
  }

}
