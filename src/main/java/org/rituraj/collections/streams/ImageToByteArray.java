package org.rituraj.collections.streams;

import java.io.*;
import java.util.*;

class ImageToByteArray {
    public static void main(String[] args) throws IOException {
        File img = new File("input.jpg");
        File outputImg = new File("output.jpg");
        try (FileInputStream fis = new FileInputStream(img);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            byte[] imgBytes = baos.toByteArray();
            try (FileOutputStream fos = new FileOutputStream(outputImg)) {
                fos.write(imgBytes);
            }
        }
    }
}