package Tp8.Ex2;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FileUtil util = new FileUtil(); 
        List<Integer> nums = util.readNumbers("C:\\Users\\DELL\\eclipse-workspace\\JavaFundamentals\\MLIAEedu\\Tp8\\Ex2\\Numbers.txt");

        System.out.println("Nombres lus : " + nums);
    }
}
