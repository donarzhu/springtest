package com.spring.test;

import java.util.Set;

/**
 * Created by donar on 2016/11/3.
 */
public class Customer {
    private Set sets;

    public Set getSets() {
        return sets;
    }

    public void setSets(Set sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Customer [sets=" + sets + "]";
    }
}
