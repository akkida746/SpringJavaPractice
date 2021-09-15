package com.example.practice;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public class SoftReferenceDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("test");
        SoftReference<StringBuilder> reference1 = new SoftReference<>(sb);
        ReferenceQueue<StringBuilder> referenceQueue = new ReferenceQueue<>();
        SoftReference<StringBuilder> reference2 = new SoftReference<>(sb, referenceQueue);

        StringBuilder sb1 = reference1.get();
        reference2.clear();
        StringBuilder sb2 = reference2.get();
        System.out.println("Printing..");
        System.out.println(sb1);
        System.out.println(sb2);

        reference1.clear();
        sb1 = reference1.get();
        System.out.println(sb1);
    }
}
