package net.bigmir.sergey_8888new;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@SaveTo(path = "D:\\B\\20.txt")
public class TextContainer {
    private String line;

    public TextContainer(String line) {
        this.line = line;
    }

    @Save
    public void save(String path) {
        try {
            FileWriter writer = new FileWriter(path, false);
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.print(line);
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
