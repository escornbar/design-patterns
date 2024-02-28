/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.util.ArrayList;

/**
 *
 * @author syaamil
 */
public class DirectoryComponent implements FileSystemComponent {

    String name;
    ArrayList<FileSystemComponent> files = new ArrayList<FileSystemComponent>();

    public DirectoryComponent(String name) {
        this.name = name;
    }

    public void addFile(FileSystemComponent component) {
        files.add(component);
    }

    public void removeFile(FileSystemComponent component) {
        files.remove(component);
    }

    public ArrayList<FileSystemComponent> getAllFiles() {
        return files;
    }

    @Override
    public int getComponentSize() {
        int sum = 0;
        for (FileSystemComponent file : files) {
            sum += file.getComponentSize();
        }
        return sum;
    }

}
