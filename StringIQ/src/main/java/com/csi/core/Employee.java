package com.csi.core;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String city;
    private Gender gender;

    public Employee(String name, String city, Gender gender) {
        this.name = name;
        this.city = city;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Gender getGender() {
        return gender;
    }

    public enum Gender {
        MALE, FEMALE
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "New York", Gender.MALE));
        employees.add(new Employee("Jane", "New York", Gender.FEMALE));
        employees.add(new Employee("Alex", "San Francisco", Gender.MALE));
        employees.add(new Employee("Mary", "San Francisco", Gender.FEMALE));
        employees.add(new Employee("Bob", "San Francisco", Gender.MALE));
        
        // Group by city and gender using Java 8 stream API
        Map<String, Map<Gender, Long>> genderCountByCity = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity,
                        Collectors.groupingBy(Employee::getGender,
                                Collectors.counting())));

        // Print out the result
        genderCountByCity.forEach((city, genderCount) -> {
            System.out.println(city + ": " + genderCount);
        });
    }
}
