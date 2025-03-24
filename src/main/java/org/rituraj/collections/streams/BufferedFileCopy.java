package org.rituraj.collections.streams;

import java.io.*;

class BufferedFileCopy {
    public static void main(String[] args) throws IOException {
        File src = new File("largefile.dat");
        File dest = new File("copy.dat");

        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Buffered Copy Time: " + (endTime - startTime) + " ns");
    }
}
