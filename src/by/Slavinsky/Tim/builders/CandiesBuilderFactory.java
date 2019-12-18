package by.Slavinsky.Tim.builders;

import by.Slavinsky.Tim.parsers.DOMParser;
import by.Slavinsky.Tim.parsers.SAXParser;
import by.Slavinsky.Tim.parsers.StAXParser;
import by.Slavinsky.Tim.parsers.XMLParser;

public class CandiesBuilderFactory {

	private enum TypeParser {
		SAX, STAX, DOM
	}
	
	public XMLParser createCandiesListBuilder(String typeParser){
		
		TypeParser type = TypeParser.valueOf(typeParser.toUpperCase());
		
		switch (type){
		case SAX:
			return new SAXParser();
		case DOM:
			return new DOMParser();
		case STAX:
			return StAXParser.getInstance();
		default:
			throw new EnumConstantNotPresentException (type.getDeclaringClass(), type.name());
		}
		
	}
}
