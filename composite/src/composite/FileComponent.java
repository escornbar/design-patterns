/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author syaamil
 */
public class FileComponent implements FileSystemComponent {

    String name;
    int size;

    public FileComponent(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getComponentSize() {
        return this.size;
    }

}
