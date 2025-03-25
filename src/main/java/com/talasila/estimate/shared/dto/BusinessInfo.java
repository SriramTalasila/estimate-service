package com.talasila.estimate.shared.dto;

import lombok.Data;

@Data
public class BusinessInfo {
    private String businessName;
    private String businessId;
    private String phoneOne;
    private String phoneTwo;
    private String addressLaneOne;
    private String addressLaneTwo;
    private String city;
    private String state;
    private String country;
    private String gstNumber;
    private Boolean isSelected;
}
