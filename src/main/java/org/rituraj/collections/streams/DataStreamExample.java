package org.rituraj.collections.streams;
import java.io.*;
class DataStreamExample {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("students.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("John");
            dos.writeDouble(3.8);
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("students.dat"))) {
            System.out.println(dis.readInt() + " " + dis.readUTF() + " " + dis.readDouble());
        }
    }
}