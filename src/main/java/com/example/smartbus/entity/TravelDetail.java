package com.example.smartbus.entity;


public class TravelDetail {

  private int id;
  private int userId;
  private String time;
  private String route;
  private String upState;
  private String downState;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  public String getRoute() {
    return route;
  }

  public void setRoute(String route) {
    this.route = route;
  }


  public String getUpState() {
    return upState;
  }

  public void setUpState(String upState) {
    this.upState = upState;
  }


  public String getDownState() {
    return downState;
  }

  public void setDownState(String downState) {
    this.downState = downState;
  }

}
