package Tp8.Ex4;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FileUtil util = new FileUtil(); 
        List<Integer> nums = util.readNumbers("C:\\Users\\DELL\\eclipse-workspace\\JavaFundamentals\\MLIAEedu\\Tp8\\Ex2\\Numbers.txt");
        System.out.println("Le cas ou le fichier est trouve: ");
        System.out.println("Nombres lus : " + nums);
        
        // Test de error.log
        System.out.println("Le cas ou le fichier n'est pas trouve");
        List<Integer> nums1 = util.readNumbers("null.txt");
        System.out.println("Resultat : " + nums1);
    }
}
