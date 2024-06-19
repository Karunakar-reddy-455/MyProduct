package com.java.siva.Hospital.Dto;

public class FlourDto {
    private String flourName;
    private Long flourId;
    private String hospitalName;
    private String locationName;

    public FlourDto(String flourName, Long flourId, String hospitalName, String locationName) {
        this.flourName = flourName;
        this.flourId = flourId;
        this.hospitalName = hospitalName;
        this.locationName = locationName;
    }

    public String getFlourName() {
        return flourName;
    }

    public void setFlourName(String flourName) {
        this.flourName = flourName;
    }

    public Long getFlourId() {
        return flourId;
    }

    public void setFlourId(Long flourId) {
        this.flourId = flourId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
