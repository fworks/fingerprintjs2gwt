package com.github.fworks.fingerprintjs2gwt.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * Resource client bundle for the js files.
 * 
 * @author flaviolcastro
 *
 */
public interface Resources extends ClientBundle {

  /** static resource object. */
  public static final Resources RESOURCES = GWT.create(Resources.class);

  /**
   * Full js file.
   * 
   * @return TextResource with the js content.
   */
  @Source("js/fingerprint2.js")
  TextResource fullScript();

  /**
   * Min js file.
   * 
   * @return TextResource with the js content.
   */
  @Source("js/fingerprint2.min.js")
  TextResource minScript();

}
