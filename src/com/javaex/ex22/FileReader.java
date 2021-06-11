package com.javaex.ex22;

import java.io.IOException;

public class FileReader {
	
	//필드
	
	
	//생성자
	
	
	//메소드gs
	
	//메소드
	public void Read(String path) {
		//
		String file ="학교종이 땡땡땡 어서모이자";
		System.out.println(file);
	}
	
	public void Read2(String path) {
		//파일을 읽는다-->파일이 없는경우
		try {
			throw new IOException();
		} catch(IOException e) {
			System.out.println("파일이 없습니다.");
		}
		
	}
	
	public void Read3(String path) throws IOException {
		throw new IOException();
	}
	
}
