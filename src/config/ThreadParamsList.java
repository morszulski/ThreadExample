package config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
@XmlSeeAlso({ ThreadParams.class })
public class ThreadParamsList extends ArrayList<ThreadParams> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2742949142209592966L;
	
	private int maxNumberOfThreads;

	public int getMaxNumberOfThreads() {
		return this.maxNumberOfThreads;
	}

	public void setMaxNumberOfThreads(int maxNumberOfThreads) {
		this.maxNumberOfThreads = maxNumberOfThreads;
	}

	public ThreadParamsList() {
	}

	@XmlElement(name = "Thread")
	public List<ThreadParams> getThreads() {
		return this;
	}

	@Override
	public boolean add(ThreadParams e) {
		// TODO Auto-generated method stub
		return super.add(e);
	}

}
