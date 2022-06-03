package com.example.smartbus.entity;


public class Order {

  private int id;
  private int rid;
  private String orderTime;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getRid() {
    return rid;
  }

  public void setRid(int rid) {
    this.rid = rid;
  }


  public String getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(String orderTime) {
    this.orderTime = orderTime;
  }

}
