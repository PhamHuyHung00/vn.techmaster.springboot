package com.example.demo.model;

//location: [Hanoi, Hai Phong, Da Nang, Ho Chi Minh]
public enum Location {
    HaNoi("HaNoi"), HaiPhong("Hai Phong"), DaNang("Da Nang"), HCM("HCM");

    private String location;

    Location(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }



}
