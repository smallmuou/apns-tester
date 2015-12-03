
import com.notnoop.apns.*;

public class Pusher {
    public static void main(String[] args){
        String  p12Path = "/Users/xxx/Certificates.p12";
        String  p12Password = "xxxx";
        String  pushToken = "xxxxx";
 
        System.out.println(args);
        
        try {
        	ApnsService service =APNS.newService().withCert(p12Path,p12Password).withSandboxDestination().build();
        	String payload = APNS.newPayload().alertBody("Hello APNS").badge(1).sound("default").build();
        	service.push(pushToken, payload);
        	System.out.println("SUCCESSED");
        } catch (Exception e) {
        	System.out.println("FAILED"+e.getMessage());
        }
    }
}


