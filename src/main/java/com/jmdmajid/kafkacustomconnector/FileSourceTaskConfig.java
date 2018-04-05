package com.jmdmajid.kafkacustomconnector;

import java.util.List;
import java.util.Map;

import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigDef.Importance;
import org.apache.kafka.common.config.ConfigDef.Type;

public class FileSourceTaskConfig extends FileSourceConnectorConfig {

	private final static String FILE_READER_PREFIX = "filereader";
	private static final String FILE_FILENAME_CONF = FILE_READER_PREFIX + "filename";
	private static final String FILE_FILENAME_DOC = "File path in the system.";
	private static final String FILE_READER_CLASS_CONF = FILE_READER_PREFIX + "class";
    private static final String FILE_READER_CLASS_DOC = "File reader class to read files.";
	
	public FileSourceTaskConfig(ConfigDef definition, Map<?, ?> originals) {
		super(definition, originals);
	}
	
	public FileSourceTaskConfig(Map<String, String> originals) {
		this(configure(),originals);
	}
	
	public static ConfigDef configure() {
        return FileSourceConnectorConfig.configure()
    	        .define(FILE_FILENAME_CONF, Type.LIST, Importance.HIGH, FILE_FILENAME_DOC)
                .define(FILE_READER_CLASS_CONF, ConfigDef.Type.CLASS, ConfigDef.Importance.HIGH, FILE_READER_CLASS_DOC);
    }
    
	public String getFileReaderClass() {
		return this.getString(FILE_READER_CLASS_CONF);
	}

	public List<String> getFileFilenameConf() {
		return this.getList(FILE_FILENAME_CONF);
	}
}
