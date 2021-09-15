import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

class Scratch {
    public static void main(String[] args) {
        InetAddress ip = null;
        InetAddress[] ipArr = null;

        try{
            ip = InetAddress.getByName("www.naver.com");
            System.out.println("hostName = " + ip.getHostName());
            System.out.println("HostAddress = "+ ip.getHostAddress());
            System.out.println("ip.toString() = " + ip.toString());
            
            byte[] ipAddr = ip.getAddress();
            System.out.println("Arrays.toString(ipAddr) = " + Arrays.toString(ipAddr));

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}