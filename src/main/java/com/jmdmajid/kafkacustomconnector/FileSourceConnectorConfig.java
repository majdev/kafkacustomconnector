package com.jmdmajid.kafkacustomconnector;

import java.util.List;
import java.util.Map;

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigDef.Importance;
import org.apache.kafka.common.config.ConfigDef.Type;

public class FileSourceConnectorConfig  extends AbstractConfig{
	
	private static final String FILE_TASK_MAX_CONF = "tasks.max";
	private static final String FILE_TASK_MAX_DOC = "The maximum number of tasks for this connector.";
	private static final String FILE_CONNECTOR_NAME_CONF = "name";
	private static final String FILE_CONNECTOR_NAME_DOC = "Unique connector's name.";
	private static final String FILE_CONNECTOR_CLASS_CONF = "connector.class";
	private static final String FILE_CONNECTOR_CLASS_DOC = "The Java class for the connector.";
	private static final String FILE_KAFKA_SOURCE_TOPIC_NAME_CONF = "topic";
	private static final String FILE_KAFKA_SOURCE_TOPIC_NAME_DOC = "A list of topics to use as input for this connector";

	public FileSourceConnectorConfig(ConfigDef definition, Map<?, ?> originals) {
		super(definition, originals);
	}
	
	public FileSourceConnectorConfig(Map<String, String> parsedConfig) {
	    this(configure(), parsedConfig);
	}
	
	public static ConfigDef configure() {
	    return new ConfigDef()
	        .define(FILE_TASK_MAX_CONF, Type.INT, 1, Importance.HIGH, FILE_TASK_MAX_DOC)
	        .define(FILE_CONNECTOR_NAME_CONF, Type.STRING, ConstantValues.getConnectorName(), Importance.HIGH, FILE_CONNECTOR_NAME_DOC)
	        .define(FILE_CONNECTOR_CLASS_CONF, Type.CLASS, ConstantValues.getConnectnorClassName(), Importance.HIGH, FILE_CONNECTOR_CLASS_DOC)
	        .define(FILE_KAFKA_SOURCE_TOPIC_NAME_CONF, Type.LIST, Importance.HIGH, FILE_KAFKA_SOURCE_TOPIC_NAME_DOC);
	  }
	
	public int getFileTaskMaxConf() {
		return this.getInt(FILE_TASK_MAX_CONF);
	}

	public String getFileConnectorNameConf() {
		return this.getString(FILE_CONNECTOR_NAME_CONF);
	}

	public String getFileConnectorClassConf() {
		return this.getString(FILE_CONNECTOR_CLASS_CONF);
	}

	public List<String> getFileKafkaSourceTopicNameConf() {
		return this.getList(FILE_KAFKA_SOURCE_TOPIC_NAME_CONF);
	}
}
