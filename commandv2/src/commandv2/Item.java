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
public class Item {

    int id;
    String name;
    HashMap<String, Category> categories = new HashMap<String, Category>();

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        String toReturn = "Item '" + name + "' belongs to these categories " + categories.keySet();

        return toReturn;
    }

}
