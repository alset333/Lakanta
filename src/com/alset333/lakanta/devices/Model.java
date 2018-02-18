package com.alset333.lakanta.devices;

/**
 * @author alset333
 *
 */
public class Model {
	
	private String vendorStr;
	private String modelStr;
	
	private String url;
	
	public Model(String v, String m) {
		vendorStr = v;
		modelStr = m;
		
		url = findUrl(vendorStr, modelStr);
		
	}
	
	

	public String getUrl() {
		return url;
	}
	
	
	private String findUrl(String vendorStr2, String modelStr2) {

		if(vendorStr.toLowerCase() == "DLink".toLowerCase()) {
			if(modelStr.toLowerCase() == "2132LB1".toLowerCase()) {
				return "/dms?nowprofileid=1";
			}
		}
		
		return null;
		
	}
	
	public String toString() {
		return vendorStr + " " + modelStr + " " + getUrl();
	}
	
}
