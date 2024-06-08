package tests.models;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import com.opencsv.bean.CsvToBeanBuilder;

import common.Utils;

public class ModelsProcess {
	public Register convertRegisterFromCsv(String fileName) {
		Register register= new Register();
		//Utils utils = new Utils();
		String registerDataPath = System.getProperty("user.dir") + "\\testdata\\"+ fileName;
		try {
			List<Register> registers = new CsvToBeanBuilder<Register>(new FileReader(registerDataPath)).withType(Register.class).build().parse();
			register =registers.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return register;
	}

}
