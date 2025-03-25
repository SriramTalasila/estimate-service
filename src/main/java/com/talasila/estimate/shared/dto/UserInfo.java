package com.talasila.estimate.shared.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserInfo {

    private String name;
    private String email;
    private List<String> userRoles;
    private List<BusinessInfo> businessInfoList;
}
