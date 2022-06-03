package com.example.smartbus.dto;

import com.example.smartbus.entity.BusRoute;

public class BusRouteDto extends BusRoute {

    String driverName;
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

}
