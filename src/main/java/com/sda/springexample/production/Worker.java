package com.sda.springexample.production;

import java.util.Objects;

public class Worker {
    private String proffesion;
    private int age;


    public String getProffesion() {
        return proffesion;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age &&
                Objects.equals(proffesion, worker.proffesion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proffesion, age);
    }
}
