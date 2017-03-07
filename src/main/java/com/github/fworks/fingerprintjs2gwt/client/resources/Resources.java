package com.github.fworks.fingerprintjs2gwt.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface Resources extends ClientBundle {

	public static Resources RESOURCES = GWT.create(Resources.class);

	@Source("js/fingerprint2.js")
	TextResource fullScript();

	@Source("js/fingerprint2.min.js")
	TextResource minScript();

}
