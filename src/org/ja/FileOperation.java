package org.ja;

import java.io.File;
import java.io.IOException;

public class FileOperation {
public static void main(String[] args) throws IOException {
	File f=new File("c:\\Users\\aaa");
	String[]li=f.list();
	for (String f1 : li) {
		System.out.println(f1);
	}
	
}

}

