package com.example.cse_mjcet;

public class Teacher {
    private int id;
    private String name;
    private String designation;
    private String qualification;
    private String mobile;
    private String room;
    private int image;

    public Teacher(int id, String name, String designation, String qualification, String mobile, String room, int image) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.qualification = qualification;
        this.mobile = mobile;
        this.room = room;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getQualification() {
        return qualification;
    }

    public String getMobile() {
        return mobile;
    }

    public String getRoom() {
        return room;
    }

    public int getImage() {
        return image;
    }
}
