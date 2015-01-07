package com.chinabank.wyrcm;

import java.util.Iterator;

import org.paukov.combinatorics.Factory;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;

public class Test {  
    
    public static void main(String[] args) {  
        System.err.println(new Test().method1());  
        System.err.println(new Test().method2());  
    }  
       
    public int method1() {  
        int x = 1;  
        try {  
            return x;  
        } finally {  
            ++x;  
        }  
    }  
       
    public int method2() {  
        int x = 1;  
        try {  
            return x;  
        } finally {  
            return ++x;  
        }  
    }  
}