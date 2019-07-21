package webdriver_jun12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class read_from_csv_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub\\
		
		String datafile = "c:/output/data.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        br = new BufferedReader(new FileReader(datafile));
        while ((line = br.readLine()) != null) 
        {
                    String[] data = line.split(cvsSplitBy);
                    System.out.println(data[0] + data[1] + data[2]);
        }

		

	}

}
