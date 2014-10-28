package net.prvitamin.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public final class FileUtils {

  public static File[] getFilesInFolder(String folderPath) {
    File folderFile = new File(folderPath);
    if (folderFile.isDirectory()) {
      return folderFile.listFiles();
    } else {
      return null;
    }
  }

  public static String readFileContent(File file) throws IOException {
    if (file.isFile()) {
      BufferedReader br = new BufferedReader(new FileReader(file));
      StringBuffer sb = new StringBuffer();
      String temp = br.readLine();
      while (temp != null) {
        sb.append(temp);
        temp = br.readLine();
      }
      br.close();
      return sb.toString();
    }
    return null;
  }

}
