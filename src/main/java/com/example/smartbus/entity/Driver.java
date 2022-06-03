package com.example.smartbus.entity;


public class Driver {

  private int id;
  private String name;
  private String cardNum;
  private String hiredate;
  private String photo;
  private String busNum;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getCardNum() {
    return cardNum;
  }

  public void setCardNum(String cardNum) {
    this.cardNum = cardNum;
  }


  public String getHiredate() {
    return hiredate;
  }

  public void setHiredate(String hiredate) {
    this.hiredate = hiredate;
  }


  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }


  public String getBusNum() {
    return busNum;
  }

  public void setBusNum(String busNum) {
    this.busNum = busNum;
  }

}
