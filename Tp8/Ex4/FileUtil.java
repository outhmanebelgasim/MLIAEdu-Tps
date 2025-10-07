package Tp8.Ex4;

import java.io.*;
import java.util.*;

public class FileUtil {
    public List<Integer> readNumbers(String path) {
        List<Integer> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                list.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            logError("I/O error: " + path + " - " + e.getMessage());
        } catch (NumberFormatException e) {
            logError("Number format error: " + e.getMessage());
        }

        return list;
    }

    private void logError(String message) {
        String logPath = "C:\\Users\\DELL\\eclipse-workspace\\JavaFundamentals\\MLIAEedu\\Tp8\\Ex4\\error.log";
        try (FileWriter writer = new FileWriter(logPath, true)) {
            writer.write(new Date() + " - " + message + "\n");
        } catch (IOException ex) {
            System.err.println("Impossible d’écrire dans error.log: " + ex.getMessage());
        }
    }

}
