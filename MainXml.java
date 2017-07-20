import java.io.File;

import org.xtphere.example1.ReadDatabase;
import org.xtphere.example1.ReadXML;

public class MainXml {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ReadDatabase rdb = new ReadDatabase();
		File fXmlFile = new File("C:\\Users\\zafrane\\Front-end.xml");
		String pIva_find = ReadXML.readXML(fXmlFile);
		rdb.readConn(pIva_find);

	}

}
