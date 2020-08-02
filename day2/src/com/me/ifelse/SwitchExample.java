package com.me.ifelse;

public class SwitchExample {
    public static void main(String[] args) {
        int value = 3;
        switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.print("Value was not 1 or 2");
                break;
        }
    }

}
