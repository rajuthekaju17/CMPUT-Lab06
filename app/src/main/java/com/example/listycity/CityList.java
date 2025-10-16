package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects.
 */
public class CityList {

    private List<City> cities = new ArrayList<>();

    /**
     * If city DNE, add a city to the list
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns a sorted list of cities
     * @return Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Check if the given city exists in list.
     * @param city The city to check.
     * @return True if the city exists, false otherwise.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes the given city from the list, if it exists.
     * @param city The city to delete.
     * @throws IllegalArgumentException if the city does not exist in the list.
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in the list");
        }
        cities.remove(city);
    }

    /**
     * Returns the count of cities currently in the list.
     * @return The number of cities in the list.
     */
    public int numberOfCities() {
        return cities.size();
    }

}
