package hu.nive.ujratervezes.zarovizsga.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class People {
    public int getNumberOfMales(String path) {
        Path file = Path.of(path);
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            return getMaleCount(reader);
        } catch (
                IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private int getMaleCount(BufferedReader reader) throws IOException {
        String line;
        int maleCount = 0;
        while ((line = reader.readLine()) != null) {
            if (line.split(",")[4].equals("Male")) {
                maleCount ++;
            }
        }
        return maleCount;
    }
}
