package app_execution;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;

import parsing_data.Email;

public class DomParserRun
{

	private static final String EMAILS_XML = "emails.xml";
 	public static void main(String[] args)
			throws ParserConfigurationException, IOException, XMLStreamException {
		
 		System.out.println(" ============================== DOM parser =========================");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document document = dBuilder.parse(EMAILS_XML);
		emails = new DomParser().parse(document);
		emails.forEach(email -> System.out.println(email));
	}
}