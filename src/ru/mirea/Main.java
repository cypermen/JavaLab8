package ru.mirea;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileWriter writer = new
                FileWriter("D:\\файл.txt", false))
        {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();

            writer.write(str);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}