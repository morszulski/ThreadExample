package creator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import config.ThreadParams;
import config.ThreadParamsList;

public class ThreadXmlWriter {

	public static void main(String[] args) {

		ThreadParamsList threadList = new ThreadParamsList();
		threadList.setMaxNumberOfThreads(2);
		threadList.add(new ThreadParams("1I1I1I1I", 1400L));
		threadList.add(new ThreadParams("2Z2Z2Z2z", 2100L));
		threadList.add(new ThreadParams("3E3E3E3e", 1730L));

		// ThreadParams t1 = new ThreadParams();
		// t1.setName("MAC");
		// t1.setTimeToRun(10000L);
		// threadList.add(t1);
		// ThreadParams t2 = new ThreadParams();
		// t2.setName("wWWW2");
		// t2.setTimeToRun(6000L);
		// threadList.add(t2);
		// ThreadParams t3 = new ThreadParams();
		// t3.setName("XXXXXX");
		// t3.setTimeToRun(12000L);
		// threadList.add(t3);

		// try {
		// XMLEncoder fos = new XMLEncoder(
		// new FileOutputStream("E:\\Maciej\\workspace
		// eclipse\\ThreadExample\\resources\\config.xml"));
		// fos.writeObject(threadList);
		// fos.close();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(ThreadParamsList.class);
			Marshaller m = jaxbContext.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(threadList,
					new FileOutputStream("E:\\Maciej\\workspace eclipse\\ThreadExample\\resources\\config.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
