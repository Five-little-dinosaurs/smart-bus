package com.example.smartbus.entity;


public class DriverViolate {

  private int id;
  private int driverId;
  private String time;
  private String thing;
  private String punishment;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getDriverId() {
    return driverId;
  }

  public void setDriverId(int driverId) {
    this.driverId = driverId;
  }


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  public String getThing() {
    return thing;
  }

  public void setThing(String thing) {
    this.thing = thing;
  }


  public String getPunishment() {
    return punishment;
  }

  public void setPunishment(String punishment) {
    this.punishment = punishment;
  }

}
