/**
 * 
 */
package com.alset333.lakanta;

import com.alset333.lakanta.devices.Model;
import com.alset333.lakanta.devices.vendors.dlink.DLinkIPCamera;

/**
 * @author alset333
 *
 */
public class Lakanta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
		
		Model m = new Model("DLink", "2132LB1");
		DLinkIPCamera denCam = new DLinkIPCamera(m);

	}

}
