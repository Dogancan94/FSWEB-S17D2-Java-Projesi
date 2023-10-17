package com.workintech.dependencyproject.validation;

import com.workintech.dependencyproject.model.Developer;

import java.util.Map;

public class DeveloperValidation {

    public static boolean isDeveloperExist(Map<Integer, Developer> developers, int id){
       return developers.containsKey(id);
    }

}
