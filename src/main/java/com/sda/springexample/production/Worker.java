package com.sda.springexample.production;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

public class Worker {


    private String proffesion;
    private int age;
    private List<Tool> tools;

    @Autowired private final WorkerMotto workerMotto;

    public Worker(String proffesion, int age, WorkerMotto workerMotto) {
        this.proffesion = proffesion;
        this.age = age;
        this.workerMotto = workerMotto;
    }

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

    @Override
    public String toString() {
        return "Worker{" +
                "proffesion='" + proffesion + '\'' +
                ", age=" + age +  " motto : " + workerMotto +  " tools : " + tools +
                '}';
    }

    public List<Tool> getTools() {
        return tools;
    }

    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }
}
