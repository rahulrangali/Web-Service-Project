package org.rahul.rr;


import javax.xml.bind.annotation.*;






@XmlRootElement(name="StockQuotes")

public class StockQuotes {

	
		private Stock stock;
		
		@XmlElement(name="Stock")
	    public Stock getStock() {
			//System.out.println(stock);
	        return stock;
	    }
	 
	    public void setStock(Stock stock) {
	        this.stock = stock;
	    }
	    
  
	   
}



