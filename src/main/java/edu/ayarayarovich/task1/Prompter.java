package edu.ayarayarovich.task1;

import java.io.*;

public class Prompter {
    BufferedReader bufferedReader;
    PrintStream printStream;

    public Prompter(InputStream inputStream, PrintStream printStream, String description) {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        this.printStream = printStream;
        this.printStream.println(description + ": ");
    }

    public int askForInt(String description) {
        return Integer.parseInt(getLineInsist(description));
    }

    public String askForLine(String description) {
        return getLineInsist(description);
    }

    private String getLineInsist(String description) {
        String line = "";
        while (line.isEmpty()) {
            this.printStream.print("\tEnter " + description + ": ");
            try {
                line = bufferedReader.readLine();
            } catch (IOException ignore) {}
        }
        return line;
    }

}
