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
        String code = data[3]; //部門コードを出力
        System.out.println(code);

//        if (code.equals("1") ){
//        	System.out.println("社員コード:" + data[0] + ",部門コード:" + data[1] + ",部署：" + data[2] + ":自分のさじ加減で人を決めます");
//        }else if (code.equals("2") ){
//           	System.out.println("社員コード:" + data[0] + ",部門コード:" + data[1] + ",部署：" + data[2] + ":雑用的なことをしています");
//        }else if (code.equals("3") ){
//           	System.out.println("社員コード:" + data[0] + ",部門コード:" + data[1] + ",部署：" + data[2] + ":奴隷のように働かされます");
//
//        	}

        //for (String elem : data) {
          //System.out.println(elem);
        //}

      }
      br.close();

    } catch (IOException e) {
      System.out.println(e);
    }
  }
}