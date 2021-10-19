package com.company;

public class Computer {
    //Inner class 1
    public class Disk {
        //Disk class methods
        public void driveC() {
            System.out.println("PC user can access to C Drive");
        }
        public void driveD() {
            System.out.println("PC user can access to D Drive");
        }
    }

    //Inner class 2
    public class RamMemory {
        protected int v1(int v1) {
            System.out.println(v1 + " GB RAM");
            return v1;
        }
    }

    //Inner class 3
    public class Processor {
        public void i3() {
            System.out.println("i3 processor");
        }
        public void i5() {
            System.out.println("i5 processor");
        }
    }
}
