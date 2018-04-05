package com.jmdmajid.kafkacustomconnector;

public class ConstantValues {
	private static final String CONNECTOR_NAME = "source-file-connector";
	private static final String CONNECTNOR_CLASS_NAME = "com.jmdmajid.kafkacustomconnector.FileSourceConnector";
	
	public static String getConnectorName() {
		return CONNECTOR_NAME;
	}
	
	public static String getConnectnorClassName() {
		return CONNECTNOR_CLASS_NAME;
	}
	
	
}
