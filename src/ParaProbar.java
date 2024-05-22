import com.opencsv.*;
import com.opencsv.exceptions.CsvException;
import uy.edu.um.prog2.adt.linkedlist.MyList;

import java.io.*;
import java.util.List;

public class ParaProbar {
    public static void main(String[] args) throws IOException, CsvException {
        CSVReader csvReader = new CSVReader(new FileReader("data_set.csv"));
        List<String[]> datos = csvReader.readAll();
    }
}
