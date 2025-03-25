package org.rituraj.streams;
import java.io.*;
class PipedStreamExample {
    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream(pis);
        new Thread(() -> {
            try (pos) { pos.write("Hello from Writer".getBytes()); }
            catch (IOException e) { e.printStackTrace(); }
        }).start();
        new Thread(() -> {
            try (pis) { System.out.println(new String(pis.readAllBytes())); }
            catch (IOException e) { e.printStackTrace(); }
        }).start();
    }
}