package com.company;

public class Information {
    int arr[] = new int[5];

    public int trying() {
        try {
            arr[500] = 30;
        } catch (ArrayIndexOutOfBoundsException | StackOverflowError e) {
            System.out.println(e);
            System.exit(77); // libo beskone4ni cikl , libo system.exit
        } finally {
            System.out.println("LALA");
        }
        return 1;
    }
}

