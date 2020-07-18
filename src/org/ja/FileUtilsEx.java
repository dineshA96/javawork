package org.ja;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileUtilsEx{
public static void main(String[] args) throws Exception {
	File f=new File("D:\\aa\\bb\\cc\\dd\\ee\\f.txt");
	List<String> r = FileUtils.readLines(f);
	System.out.println("normal for loop");
	for (int i = 0; i < r.size(); i++) {
		System.out.println(r.get(i));		
	}
	for (String x : r) {
		System.out.println(x);
		
	}
	
	
	
	
	
	
}
}