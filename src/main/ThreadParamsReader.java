package main;

import java.io.InputStream;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

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
