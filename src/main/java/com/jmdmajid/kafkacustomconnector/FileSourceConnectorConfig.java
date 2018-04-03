package com.jmdmajid.kafkacustomconnector;

import java.util.Map;

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;

public class FileSourceConnectorConfig  extends AbstractConfig{

	public FileSourceConnectorConfig(ConfigDef definition, Map<?, ?> originals) {
		super(definition, originals);
		// TODO Auto-generated constructor stub
	}

}
