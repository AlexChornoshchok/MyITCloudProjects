package com.ua.LabWork2.threads;

import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrentCollection {
    ConcurrentHashMap<Integer, String> conHashMap;

    public TestConcurrentCollection(ConcurrentHashMap<Integer, String> conHashMap) {
        this.conHashMap = conHashMap;
    }
}
