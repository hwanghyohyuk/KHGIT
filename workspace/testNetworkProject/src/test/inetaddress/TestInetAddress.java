package test.inetaddress;

import java.net.*;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) {
		
		InetAddress address;
		try {
			address = InetAddress.getLocalHost();
			System.out.println(address);
			InetAddress[] addressarr = InetAddress.getAllByName("www.naver.com");
			int i =0;
			while(i<addressarr.length){
				System.out.println(addressarr[i].getHostAddress());
				i++;
			}
			byte[] adr = {(byte) 202,(byte) 179,(byte) 177,21};
			address = InetAddress.getByName("naver.com");
			System.out.println(address.getCanonicalHostName());
			System.out.println(address.getHostName());
			System.out.println(address.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
