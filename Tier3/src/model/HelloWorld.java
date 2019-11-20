package model;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.xml.ws.Endpoint;

@WebService()
public class HelloWorld {
    @GET
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
  public static void main(String[] argv) {
    Object implementor = new HelloWorld();
    String address = "http://localhost:9000/HelloWorld";
    Endpoint.publish(address, implementor);
    
  }
}