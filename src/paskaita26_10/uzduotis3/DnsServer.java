package paskaita26_10.uzduotis3;

public class DnsServer {
	protected String ip1;
	protected String ip2;
	
	public DnsServer( String ip1, String ip2 ) {
		this.ip1 = ip1;
		this.ip2 = ip2;
	}

	@Override
	public String toString() {
		return "DnsServer [ip1='" + ip1 + "', ip2='" + ip2 + "']";
	}
	
	
}
