package com.focus.weborder;

import com.focus.weborder.api.RESTInvoker;

public class CustmobilSyncApplication {

	public CustmobilSyncApplication() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("CustmobilSyncApplication");
		RESTInvoker ri = new RESTInvoker(
				"http://focusdev.focus.co.id:9080",
				"FDIadmin",
				"password");
		String restResponse = ri.getRESTResponse("/weborder/rest/listmobil/sync");
		System.out.println("restResponse: " + restResponse);
	}

}
