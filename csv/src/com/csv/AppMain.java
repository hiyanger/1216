package com.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.io.PrintStream;
import java.io.InputStreamReader;

class AppMain {
  public static void main(String args[]) {
      File f = new File("c:\\Users\\work\\data.csv");
      try {
      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f),"Shift-JIS"));

      String line;
      // 1行ずつCSVファイルを読み込む
      while ((line = br.readLine()) != null) {
        String[] data = line.split(",", 0); // 行をカンマ区切りで配列に変換

        for (String elem : data) {
        	//PrintStream out = new PrintStream(System.out, true, "SHIFT-JIS");
          System.out.println(elem);
        }
      }
      br.close();

    } catch (IOException e) {
      System.out.println(e);
    }
  }
}