package com.proz2018;

import java.util.Date;

public class Devices { 
    /** Mandatory */
    String deviceLabel; // why all class fields are not private?

    /** Default */
    String deviceName;
    Boolean enabled;
    String description;

    Date createdAtDate; // please use java8 date objects (Instant or LocalDate or etc)
    Date lastActivity;

    com.proz2018.model.Context context; // why full package name? it can be imported

    public Devices(String deviceLabel, String deviceName, Boolean enabled, String description, Date createdAtDate) {
        this.deviceLabel = deviceLabel;
        this.deviceName = deviceName;
        this.enabled = enabled;
        this.description = description;
        this.createdAtDate = createdAtDate;
    }

    public String getDeviceLabel() {
        return deviceLabel;
    }


    public String getDeviceName() {
        return deviceName;
    }



    public Boolean getEnabled() {
        return enabled;
    }



    public String getDescription() {
        return description;
    }



    public Date getCreatedAtDate() {
        return createdAtDate;
    }


}
