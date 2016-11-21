package config;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "timeToRun" })
public class ThreadParams {

	private String name;
	private Long timeToRun;

	public ThreadParams(String name, Long timeToRun) {
		this.name = name;
		this.timeToRun = timeToRun;
	}

	public ThreadParams() {
	}

	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public Long getTimeToRun() {
		return timeToRun;
	}

	public void setTimeToRun(Long timeToRun) {
		this.timeToRun = timeToRun;
	}

	@Override
	public String toString() {
		return "ThreadParams [name=" + name + ", timeToRun=" + timeToRun + "]";
	}

}
