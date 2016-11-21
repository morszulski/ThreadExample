package main;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import config.ThreadParamsList;

public class ThreadParamsReader {

	private ThreadParamsList threadList;
	private String fileName;

	public ThreadParamsReader(String fileName) {
		this.fileName = fileName;
		// this.threadList = null;
	}

	public ThreadParamsList readParams() {
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(ThreadParamsList.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			InputStream is = ThreadExample.class.getClassLoader().getResourceAsStream(this.fileName);
			threadList = (ThreadParamsList) unmarshaller.unmarshal(is);		
		} catch (JAXBException e) {
			e.printStackTrace();
		}
        return threadList;
	}

}
