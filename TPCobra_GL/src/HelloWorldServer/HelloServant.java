package HelloWorldServer;
import org.omg.CORBA.ORB;
import HelloWorld.HelloPOA;

public class HelloServant extends HelloPOA {
	private String Message = "Bonjour tous Le monde !!";
	private ORB orb;
	
	public void setORB(ORB orb) { this.orb = orb; }
	
	@Override
	public String HelloMessage() {
		return Message;
	}

	@Override
	public void HelloMessage(String newHelloMessage) {
		Message = newHelloMessage;
	}
}



