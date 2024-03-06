package com.codecirs;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMinor;
    Student(String firstName, String lastName, int age, boolean isMinor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMinor = age < 18;
    }

    public void setSt1(String st1) {
        this.firstName = st1;
    }

    public void setSt2(String st2) {
        this.lastName = st2;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMinor(boolean minor) {
        this.isMinor = minor;
    }

    public String getSt1() {
        return firstName;
    }

    public String getSt2() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMinor() {
        return isMinor;
    }

    public void increaseAge() {
        age++;
        isMinor = age < 18;
    }

    public String toString() {
        String status = isMinor ? "minor" : "adult";
        return lastName + ", " + firstName + " - " + age + " - " + status;
    }
}
