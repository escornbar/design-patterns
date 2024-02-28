/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite;

/**
 *
 * @author syaamil
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileComponent file1 = new FileComponent("Jan1DataFile.txt", 1000);
        FileComponent file2 = new FileComponent("Jan2DataFile.txt", 2000);
        FileComponent file3 = new FileComponent("Feb1DataFile.txt", 3000);
        FileComponent file4 = new FileComponent("Feb2DataFile.txt", 4000);
        
        DirectoryComponent dir1 = new DirectoryComponent("Jan");
        dir1.addFile(file1);
        dir1.addFile(file2);
        
        DirectoryComponent dir2 = new DirectoryComponent("Feb");
        dir2.addFile(file3);
        dir2.addFile(file4);
        
        DirectoryComponent main = new DirectoryComponent("Year2019");
        main.addFile(dir1);
        main.addFile(dir2);
        
        System.out.println(main.name+" Folder size: "+main.getComponentSize()+"kb");
        System.out.println(dir1.name+" size: "+dir1.getComponentSize()+"kb");
    }
    
}
