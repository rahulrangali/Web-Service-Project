package org.rahul.rr;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class RAHUL {

	public static void main(String[] args) throws IOException,
			ParserConfigurationException, SAXException, InterruptedException {

		Map<String, List<Double>> hm = new LinkedHashMap<String, List<Double>>();
		Map<String, Double> hm2 = new LinkedHashMap<String, Double>();

		
		//TO RUN IT FOR 24 HRS i HAS TO BE ITERATED 144 TIMES... IF ONLY IT HAS TO RUN FROM 9.30 AM - 4.00 PM THEN IT HAS TO BE ITERATED FOR 39 TIMES.
		for (int i = 0; i < 144; i++) {

			BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(
						"rr.txt"));

				String line = null;
				

				while ((line = br.readLine()) != null) {
					String xml = late.getXML(line);
					xml = xml.replaceAll("&\\s+", "&amp;");
					Stock stock = late.getObjFromXML(xml);

					String name = stock.getSymbol();
					Double rate = Double.parseDouble(stock.getLast());

					List<Double> currentValue = new ArrayList<Double>();
					if (!hm.containsKey(name)) {
						currentValue.add(rate);
						hm.put(name, currentValue);
					} else {
						List<Double> cvv = hm.get(name);
						cvv.add(rate);
						hm.put(name, cvv);

					}
					double fluc = calcMaxFluc(hm, name);
					hm2.put(name, fluc);

				}
				System.out.println(hm2);
				System.out.println(hm);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Thread.sleep(1000 * 60 * 10);
			
		}
		
		Map.Entry<String, Double> maxEntry = null;
		

		for (Map.Entry<String, Double> entry : hm2.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		        
		    }
		}
		
		PrintWriter out = new PrintWriter(new FileWriter(
				"53286708.txt"));
		out.println(hm);
		out.println(hm2);
		out.println("Max Fluctuation is in:  "+maxEntry);
		out.flush();
		out.close();

	}

	private static double calcMaxFluc(Map<String, List<Double>> hm, String name)
			throws IOException {
		
		List<Double> value = hm.get(name);
		double average = 0;
		double variance = 0;

		for (Double price : value) {
			average += Double.valueOf(price);
		}

		average = Math.floor((average / value.size()));

		for (Double price : value) {
			variance += ((Double.valueOf(price) - average) * (Double
					.valueOf(price) - average));
		}

		double fluc = Math.sqrt(((variance / value.size())));
		
		
		return fluc;
		

	}

	

}
