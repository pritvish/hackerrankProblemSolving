package tsys;

import java.util.ArrayList;
import java.util.List;

public class UniqueDeviceNames {




    public static List<String> deviceNamesSystem(List<String> devicenames) {

        List<String> updatedDevices = new ArrayList<>();
        for (String devicename : devicenames) {
            if (devicenames.contains(devicename)){

                if (!updatedDevices.contains(devicename)) {
                    updatedDevices.add(devicename);
                } else if (!updatedDevices.contains(devicename+"1")){
                    updatedDevices.add(devicename+"1");
                } else {
                    String str = devicename.substring(0,devicename.length());
                    Integer i = Integer.sum(devicename.length()-1,1);
                    System.out.println(devicename.indexOf(devicename.length())+ " is at index");
                    System.out.println(i + " is sum");
                    updatedDevices.add(str+i.toString());
                }


            }
        }


        return updatedDevices;
    }

    public static void main(String[] args) {
        List<String> devicenames = new ArrayList<>();
        devicenames.add("switch");
        devicenames.add("tv");
        devicenames.add("switch");
        devicenames.add("tv");
        devicenames.add("switch");
        devicenames.add("tv");

        List<String> deviceNamesSystem = deviceNamesSystem(devicenames);

        for (String devicename : deviceNamesSystem) {
            System.out.println(devicename);
        }
    }
}
