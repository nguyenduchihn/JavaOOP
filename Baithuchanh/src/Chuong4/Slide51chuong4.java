package Chuong4;

import java.util.HashSet;
import java.util.TreeSet;

public class Slide51chuong4 {
    public static void main(String[] args) {
        HashSet<Integer> hashSetInt = new HashSet<>();
        HashSet<Character> hashSetChar = new HashSet<>(32);
        HashSet<String> hashSetString = new HashSet<>(16, 0.75f);
        HashSet<Float> hashSetFloat = new HashSet<>(new TreeSet<>());
    }
}