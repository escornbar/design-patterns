/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandv2;

import java.util.HashMap;

/**
 *
 * @author syaamil
 */
public class Category {

    String name;
    HashMap<String, Item> items = new HashMap<String, Item>();

    public Category(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String toReturn = "Category '" + name + "' belongs to these items " + items.keySet();

        return toReturn;
    }
}
