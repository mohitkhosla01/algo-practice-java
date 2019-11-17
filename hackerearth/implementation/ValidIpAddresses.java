package implementation;

public class ValidIpAddresses {

    public static void main(String args[] ) throws Exception {

        String[] ips = {
        	"255.255.255.0",
        	"255.255.255.255",
        	"123.255.259.255",
        	"25A.255.25.-55",
        	"255.255.255"
        };
        
        for(String ip : ips) {
        	System.out.println(ip + " " + new ValidIpAddresses().checkIpValidity(ip));
        }
    }
    
    public String checkIpValidity(String ip) {
        String[] parts = ip.split("\\.");
        if(parts.length != 4) {
            return "NO";
        }
        else {
            for(String part : parts) {
                Integer num = convertStringToInteger(part);
                if(num == null || num < 0 || num > 255) {
                	return "NO";
                }
            }
            return "YES";
        }
    }
    
    public Integer convertStringToInteger(String part) {
        try {
            return Integer.parseInt(part);
        }
        catch(NumberFormatException e) {
            return null;
        }
    }
}
