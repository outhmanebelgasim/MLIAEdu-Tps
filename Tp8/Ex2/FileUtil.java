package Tp8.Ex2;

import java.io.*;
import java.util.*;

public class FileUtil {
	public List<Integer> readNumbers(String path){
		List<Integer> list = new ArrayList<Integer>();
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line;
			while((line = reader.readLine()) != null) {
				line = line.trim();
				if(line.isEmpty()) continue;
				list.add(Integer.parseInt(line));
			}
		}catch(IOException e) {
			System.err.println("I/O error: " + e.getMessage());
		}catch(NumberFormatException e) {
			System.err.println("I/O error: " + e.getMessage());
		}
		
		return list;
	}
}
