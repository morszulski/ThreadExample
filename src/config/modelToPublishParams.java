package config;

public class modelToPublishParams {
	private String name;
	private String guid;
	private String tmpPath;
	private String htmlPath;
	private String connectionString;

	public modelToPublishParams(String name, String guid, String tmpPath, String htmlPath, String connectionString) {
		this.name = name;
		this.guid = guid;
		this.tmpPath = tmpPath;
		this.htmlPath = htmlPath;
		this.connectionString = connectionString;
	}

	public modelToPublishParams() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getTmpPath() {
		return tmpPath;
	}

	public void setTmpPath(String tmpPath) {
		this.tmpPath = tmpPath;
	}

	public String getHtmlPath() {
		return htmlPath;
	}

	public void setHtmlPath(String htmlPath) {
		this.htmlPath = htmlPath;
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
