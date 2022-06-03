package com.example.smartbus.entity;


public class BusRoute {

  private int id;
  private String name;
  private int number;
  private int driverId;
  private String stateList;
  private String waitList;
  private String cash;


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


  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }


  public int getDriverId() {
    return driverId;
  }

  public void setDriverId(int driverId) {
    this.driverId = driverId;
  }


  public String getStateList() {
    return stateList;
  }

  public void setStateList(String stateList) {
    this.stateList = stateList;
  }


  public String getWaitList() {
    return waitList;
  }

  public void setWaitList(String waitList) {
    this.waitList = waitList;
  }


  public String getCash() {
    return cash;
  }

  public void setCash(String cash) {
    this.cash = cash;
  }

}
