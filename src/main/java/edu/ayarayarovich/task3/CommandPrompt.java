package edu.ayarayarovich.task3;

import java.io.*;

public class CommandPrompt {
    BufferedReader bufferedReader;
    PrintStream printStream;

    public CommandPrompt(InputStream inputStream, PrintStream printStream) {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        this.printStream = printStream;
    }

    public String getNextCommand() {
        return getLineInsist("> ");
    }

    private String getLineInsist(String prefix) {
        String line = "";
        while (line.isEmpty()) {
            this.printStream.print(prefix);
            try {
                line = bufferedReader.readLine();
            } catch (IOException ignore) {}
        }
        return line;
    }
}
