package com.github.fworks.fingerprintjs2gwt.client.ui;

public class Fingerprint2 {

	public static native String getFingerprint() /*-{
		new Fingerprint2().get(function(result, components){
  			return result; //a hash, representing your device fingerprint
		});
		return null;
	}-*/;
}
