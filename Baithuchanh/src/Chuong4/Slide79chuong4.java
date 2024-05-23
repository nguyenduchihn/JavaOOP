package Chuong4;

import java.util.HashMap;
import java.util.TreeMap;

public class Slide79chuong4 {
    public static void main(String[] args) {
        //moi phan tu trong hashMap bao gom 2 phan: key va value
        HashMap<Integer, Float> hashMap1 = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>(10);
        HashMap<Double, Double> hashMap3 = new HashMap<>(4, 0.75f);
        HashMap<Float, Integer> hashMap4 = new HashMap<>(new TreeMap<>());
    }
    
}
