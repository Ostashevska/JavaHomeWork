package com.pb.ostashevska.hw9;

import java.io.*;
import java.util.Random;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.charset.StandardCharsets;


public class FileNumbers {

    private static final Logger LOGGER = Logger.getLogger(FileNumbers.class.getName());

    public  void createNumbersFile() throws Exception {

        Path path = Paths.get("file/numbers.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
           for (int i=0; i<=10; i++) {
               int[] array = new int[10];
               final Random random = new Random();
               for (int j=0; j<=array.length; j++ ) {
                   array[j]= random.nextInt();

                   final String oneLine = Integer.toString(array[j]);
                   writer.write(oneLine);
               }
            writer.newLine();
           }
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + path.toAbsolutePath() + "\" done!");
    }

    public void createOddNumbersFile() throws IOException {
        LOGGER.entering(getClass().getName(), "createOddNumbersFile");

        Path path = Paths.get("file/numbers.txt");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        Path path1 = Paths.get("file/odd-numbers.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path1)) {
            for (String s : lines) {
                int i = Integer.parseInt(s.trim());
                if (i % 2 == 1) {
                    i = 0;
                }
                writer.write(i);
                writer.newLine();
            }
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + path.toAbsolutePath() + "\" done!");

    }

    public static void main(String[] args) throws Exception {

        System.setProperty("java.util.logging.config.file", "out/production/JavaHomeWork/com/pb/ostashevska/hw9/Logger");
        LogManager.getLogManager().readConfiguration();

        FileNumbers examples = new FileNumbers();
        examples.createNumbersFile();
        examples.createOddNumbersFile();


    }

}
