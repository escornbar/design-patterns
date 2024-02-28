/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author syaamil
 */
public class FileUtility {

    public static boolean writeToFile(String fileName, String data) {
        File file = new File(fileName);

        try {
            if (file.exists()) {
                // Append new data to the existing file
                appendToFile(file, data);
            } else {
                // Create a new file and write new data
                createAndWriteToFile(file, data);
            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    private static void appendToFile(File file, String data) {
        try (FileWriter fileWriter = new FileWriter(file, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            // Append new data to the existing file
            bufferedWriter.write(data);
            bufferedWriter.newLine(); // Add a newline for better readability

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createAndWriteToFile(File file, String data) {
        try (FileWriter fileWriter = new FileWriter(file); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            // Write new data to the newly created file
            bufferedWriter.write(data);
            bufferedWriter.newLine(); // Add a newline for better readability

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
