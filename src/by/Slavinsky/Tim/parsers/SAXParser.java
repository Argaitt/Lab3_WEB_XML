package by.Slavinsky.Tim.parsers;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.xml.sax.helpers.XMLReaderFactory;

import by.Slavinsky.Tim.entity.Candy;
import by.Slavinsky.Tim.utils.FileUtils;
import jdk.internal.org.xml.sax.SAXException;
import jdk.internal.org.xml.sax.XMLReader;

public class SAXParser implements XMLParser{

	private static final Logger log = Logger.getLogger(SAXParser.class); 
	
	@Override
	public List<Candy> createCandiesList(String xmlFileName) {
		
		FileUtils utils = new FileUtils();
		String fileName = utils.getPropertyValue("fileName");
		SimpleCandyHandler schendler = new SimpleCandyHandler();
		
		try {
			XMLReader reader = (XMLReader) XMLReaderFactory.createXMLReader();
			reader.setContentHandler(schendler);
			reader.parse(fileName);
		} catch (IOException | SAXException | org.xml.sax.SAXException e) {
			log.error(e.getMessage());
		}
		
		
		return schendler.getCandiesList();
	}

}
