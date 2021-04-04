package com.company.interfaces;

public interface ParentOne {
    default void play() {
        System.out.println("playing");
    };
    void study();
}
