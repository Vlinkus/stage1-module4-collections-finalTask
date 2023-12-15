package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> createdMap = new HashMap<>();
        sourceMap.forEach((key, value) -> {
            Set<String> mySet = createdMap.containsKey(key.length()) ? createdMap.get(key.length()) : new HashSet<>();
            mySet.add(key);
            createdMap.put(key.length(), mySet);
        });
        return createdMap;
    }
}
