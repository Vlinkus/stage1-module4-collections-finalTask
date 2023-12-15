package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectList = new ArrayList<>();
        projects.forEach((key,value) -> {
            if(value.contains(developer))
                projectList.add(key);
        });
        projectList.sort(new reversedListByStringLengthComparator());
        return projectList;
    }

}

 class reversedListByStringLengthComparator implements Comparator<String> {
     @Override
     public int compare(String a, String b) {
         if(a.length() != b.length()){
             return  Integer.compare(b.length(), a.length());
         } else {
             return b.compareTo(a);
         }
     }
 }