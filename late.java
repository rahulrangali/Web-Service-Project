package org.rahul.rr;

import java.io.StringReader;
import java.rmi.RemoteException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.rpc.ServiceException;

import NET.webserviceX.www.StockQuoteLocator;

public class late {

	public static String getXML(String code)
	{
		 String quote = "";
		    
		    try {
		        quote = new StockQuoteLocator()
		                    .getStockQuoteSoap().getQuote(code); 
		        
		    } catch (RemoteException | ServiceException e) {
		        e.printStackTrace();
		    }
		     
		    return quote;
		
	}

	public static Stock getObjFromXML(String xml) {
	
		
	    Stock stock = null;
	    try {
	 
	        JAXBContext jaxbContext = JAXBContext
	                    .newInstance(StockQuotes.class);
	       javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext
	                    .createUnmarshaller();
	        StockQuotes retr = (StockQuotes) jaxbUnmarshaller
	                    .unmarshal(new StringReader(xml));
	        
	        stock = retr.getStock();
	      
	 
	    } catch (JAXBException e) {
	        e.printStackTrace();
	    }
	 
	    return stock;
	}

		
	
	
}
