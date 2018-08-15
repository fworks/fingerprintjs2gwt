package com.github.fworks.fingerprintjs2gwt.client.ui;

/**
 * Fingerprint2 utilization class.<br>
 * It should be called by static methods.
 * 
 * @author flaviolcastro
 *
 */
public class Fingerprint2 {
  
  /**
   * Private constructor, avoiding instantiation.
   */
  private Fingerprint2() {
  }

  /**
   * Get device fingerprint.
   * 
   * @return unique fingerprint for the device
   */
  public static native String getFingerprint() /*-{
    new Fingerprint2().get(function(result, components){
      return result; //a hash, representing your device fingerprint
    });
    return null;
  }-*/;
}
