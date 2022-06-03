package com.example.smartbus.entity;


public class BusDetail {

  private String number;
  private String nowState;
  private String count;
  private int status;


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  public String getNowState() {
    return nowState;
  }

  public void setNowState(String nowState) {
    this.nowState = nowState;
  }


  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }


  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

}
