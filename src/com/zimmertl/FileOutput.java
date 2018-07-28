package com.zimmertl;

import java.io.*;

/**
 * Created by mgreen14 on 12/27/17.
 * @author Matt Green
 * @version 1.0
 */
public class FileOutput {

    Writer out = null;
    private String fileName;

    /**
     * Creates an instance of FileOutput initialized with values
     * @param fileName the name of the output file
     */
    public FileOutput(String fileName) {
        this.fileName = fileName;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
    }

    /**
     * Writes a line to the output file
     * @param line text to write to the file
     */
    public void fileWrite(String line) {
        try {
            out.write(line+"\n");
        }
        catch(Exception e) {
            System.out.println("File Write Error: " + fileName + " "  + e);
        }
    }

    /**
     * Closes the file
     */
    public void fileClose() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}