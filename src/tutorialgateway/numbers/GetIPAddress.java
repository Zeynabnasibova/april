package tutorialgateway.numbers;

import java.net.InetAddress;

public class GetIPAddress {
    public static void main(String[] args) throws Exception {

        InetAddress myIpAdd = InetAddress.getLocalHost();

        System.out.println("My IP Address is");
        System.out.println(myIpAdd.getHostAddress());
    }

}