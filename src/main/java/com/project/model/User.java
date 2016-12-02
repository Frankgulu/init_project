package com.project.model;

public class User {
    private String id;

    private String userName;

    private String userMobile;

    private String userAddress;

    private Integer userProvice;

    private Integer userCity;

    private Integer userDistrict;

    private Boolean status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Integer getUserProvice() {
        return userProvice;
    }

    public void setUserProvice(Integer userProvice) {
        this.userProvice = userProvice;
    }

    public Integer getUserCity() {
        return userCity;
    }

    public void setUserCity(Integer userCity) {
        this.userCity = userCity;
    }

    public Integer getUserDistrict() {
        return userDistrict;
    }

    public void setUserDistrict(Integer userDistrict) {
        this.userDistrict = userDistrict;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}