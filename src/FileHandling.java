import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        // Writing data to a file
        try {
            String dataToWrite = "Hello, this is a file handling example!";
            writeToFile("output.txt", dataToWrite);
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading data from a file
        try {
            String readData = readFromFile("output.txt");
            System.out.println("Read data from file: " + readData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String fileName, String data) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(data.getBytes());
        }
    }

    public static String readFromFile(String fileName) throws IOException {
        StringBuilder result = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int data;
            while ((data = fis.read()) != -1) {
                result.append((char) data);
            }
        }
        return result.toString();
    }
}

