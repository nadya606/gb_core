package jc_dz5;

import java.io.*;

public class File {
    private String[] header;
    private int[][] value;

    /*public File(String[] header, int[][] value) {
        this.header = header;
        this.value = value;
    }*/

    public String[] getHeader() {
        return header;
    }
    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getValue() {
        return value;
    }
    public void setValue(int[][] value) {
        this.value = value;
    }

    /*@Override
    public String toString() {
        return header + "\n" + value;
    }*/

    public void saveValue (String[] header, int[][] value){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("report.csv"))) {
            bufferedWriter.write(rowToString(header));
            for (int[] intRow : value) {
                bufferedWriter.write(rowToString(intRow));
            }
          System.out.println(bufferedWriter);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private <T> String rowToString(T[] row) {
        String result = "";
        for (int i = 0; i < row.length; i++) {
            result = result + row[i].toString();
            if (i != row.length - 1) {
                result += ";";
            }
        }
        return result;
    }

    public void loadValue(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("report.csv"))) {
            bufferedReader.readLine().split(";");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

