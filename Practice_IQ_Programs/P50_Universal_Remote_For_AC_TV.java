package Coding_Preparation_.Practice_IQ_Programs;

import java.util.Scanner;

class Device {
    private String name;

    Device(String name) {
        this.name = name;
    }

    public void power(String action) {
        if(action.equalsIgnoreCase("ON") || action.equalsIgnoreCase("OFF")) {
            System.out.println(name + " turned " + action);
        } else {
            System.out.println("Unsupported action for " + name);
        }
    }

    public String getName() {
        return name;
    }
}

public class P50_Universal_Remote_For_AC_TV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String deviceName = sc.next();
        String action = sc.next();

        Device tv = new Device("TV");
        Device ac = new Device("AC");

        if(deviceName.equalsIgnoreCase(tv.getName())) {
            tv.power(action);
        } else if(deviceName.equalsIgnoreCase(ac.getName())) {
            ac.power(action);
        } else {
            System.out.println("Unsupported device: " + deviceName);
        }

        sc.close();
    }
}

