package org.rahul.rr;

import javax.xml.bind.annotation.*;

public class Stock {

	
		private String symbol;
	    private String last;
	    private String date;
	    private String time;
	    private String change;
	    private String open;
	    private String high;
	    private String low;
	    private String volume;
	    private String mktCap;
	    private String previousClose;
	    private String percentageChange;
	    private String annRange;
	    private String earns;
	    private String pe;
	    private String name;
	
	    
	    @XmlElement(name="Symbol")
	    public String getSymbol() {
	        return symbol;
	    }
	    public void setSymbol(String symbol) {
	        this.symbol = symbol;
	    }
	    @XmlElement(name="Last")
	    public String getLast() {
	        return last;
	    }
	    public void setLast(String last) {
	        this.last = last;
	    }
	    @XmlElement(name="Date")
	    public String getDate() {
	        return date;
	    }
	    public void setDate(String date) {
	        this.date = date;
	    }
	    @XmlElement(name="Time")
	    public String getTime() {
	        return time;
	    }
	    public void setTime(String time) {
	        this.time = time;
	    }
	    @XmlElement(name="Change")
	    public String getChange() {
	        return change;
	    }
	    public void setChange(String change) {
	        this.change = change;
	    }
	    @XmlElement(name="Open")
	    public String getOpen() {
	        return open;
	    }
	    public void setOpen(String open) {
	        this.open = open;
	    }
	    @XmlElement(name="High")
	    public String getHigh() {
	        return high;
	    }
	    public void setHigh(String high) {
	        this.high = high;
	    }
	    @XmlElement(name="Low")
	    public String getLow() {
	        return low;
	    }
	    public void setLow(String low) {
	        this.low = low;
	    }
	    @XmlElement(name="Volume")
	    public String getVolume() {
	        return volume;
	    }
	    public void setVolume(String volume) {
	        this.volume = volume;
	    }
	    @XmlElement(name="MktCap")
	    public String getMktCap() {
	        return mktCap;
	    }
	    public void setMktCap(String mktCap) {
	        this.mktCap = mktCap;
	    }
	    @XmlElement(name="PreviousClose")
	    public String getPreviousClose() {
	        return previousClose;
	    }
	    public void setPreviousClose(String previousClose) {
	        this.previousClose = previousClose;
	    }
	    @XmlElement(name="PercentageChange")
	    public String getPercentageChange() {
	        return percentageChange;
	    }
	    public void setPercentageChange(String percentageChange) {
	        this.percentageChange = percentageChange;
	    }
	    @XmlElement(name="AnnRange")
	    public String getAnnRange() {
	        return annRange;
	    }
	    public void setAnnRange(String annRange) {
	        this.annRange = annRange;
	    }
	    @XmlElement(name="Earns")
	    public String getEarns() {
	        return earns;
	    }
	    public void setEarns(String earns) {
	        this.earns = earns;
	    }
	    @XmlElement(name="P-E")
	    public String getPe() {
	        return pe;
	    }
	    public void setPe(String pe) {
	        this.pe = pe;
	    }
	    @XmlElement(name="Name")
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }

}
