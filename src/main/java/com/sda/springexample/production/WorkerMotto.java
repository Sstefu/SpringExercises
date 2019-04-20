package com.sda.springexample.production;

import java.util.Objects;

public class WorkerMotto {

    private String citate;

    public WorkerMotto(String citate) {
        this.citate = citate;
    }

    public String getCitate() {
        return citate;
    }

    public void setCitate(String citate) {
        this.citate = citate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkerMotto that = (WorkerMotto) o;
        return Objects.equals(citate, that.citate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(citate);
    }

    @Override
    public String toString() {
        return "WorkerMotto{" +
                "citate='" + citate + '\'' +
                '}';
    }
}
