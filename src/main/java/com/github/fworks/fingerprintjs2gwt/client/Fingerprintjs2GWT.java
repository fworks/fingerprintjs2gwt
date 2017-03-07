package com.github.fworks.fingerprintjs2gwt.client;

import com.github.fworks.fingerprintjs2gwt.client.resources.Resources;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;

public class Fingerprintjs2GWT implements EntryPoint {

	@Override
	public void onModuleLoad() {
		// inject js
		ScriptInjector.fromString(Resources.RESOURCES.minScript().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}
}
