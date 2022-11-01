
public class IPDriver {

	public static void main(String[] args) {
		  IPAddress ip = new IPAddress("216.27.6.136");

		  System.out.println(ip.getDottedDecimal());

		  System.out.println(ip.getOctet(4));

		  System.out.println(ip.getOctet(1));

		  System.out.println(ip.getOctet(3));

		  System.out.println(ip.getOctet(2));
		
	}

}
