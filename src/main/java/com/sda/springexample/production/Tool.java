package com.sda.springexample.production;

import java.util.Objects;

public class Tool {
    private int weight;
    private String name;

    public Tool(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tool tool = (Tool) o;
        return weight == tool.weight &&
                name.equals(tool.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name);
    }

    @Override
    public String toString() {
        return "Tool{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
