import java.io.*;
import java.util.ArrayList;

import static java.lang.System.exit;

public class Generate_inserts {

    static ArrayList<String> firstname = new ArrayList<>();
    static ArrayList<String> lastname = new ArrayList<>();

    private static void generate_inserts() throws IOException {

        String splitBy = " ";
        String[] tempString;

        BufferedReader bufReader = new BufferedReader(new FileReader("names.txt"));

        String line = bufReader.readLine();
        while (line != null) {
            tempString = line.split(splitBy);
            firstname.add(tempString[0]);
            lastname.add(tempString[1]);
            line = bufReader.readLine();
        }

        bufReader.close();
    }

    public static void file_output() throws IOException {

        generate_inserts();

        int count = 1;
        BufferedWriter bw = new BufferedWriter(new FileWriter("insert_res_offers.txt"));
        String header = "INSERT INTO reservation_offers VALUES\n";
        bw.write(header);

        while (count < 60000) {
            // generating the index using Math.random()
            int rand_name = (int) (Math.random() * firstname.size());
            int rand_lasname = (int) (Math.random() * lastname.size());

            double pay_in_adv = 50.00 + Math.random() * (200.00 - 50.00);
            pay_in_adv = Math.round(pay_in_adv * 100.0) / 100.0;

            if(count<=20000){
                String row = "(" + count++ + ",\"" + lastname.get(rand_lasname) + "\",\"" + firstname.get(rand_name) + "\","+ 1 + "," + pay_in_adv + "),\n";
                bw.write(row);
            }
            else if(count<=40000){
                String row = "(" + count++ + ",\"" + lastname.get(rand_lasname) + "\",\"" + firstname.get(rand_name) + "\","+ 2 + "," + pay_in_adv + "),\n";
                bw.write(row);
            }
            else{
                String row = "(" + count++ + ",\"" + lastname.get(rand_lasname) + "\",\"" + firstname.get(rand_name) + "\","+ 3 + "," + pay_in_adv + "),\n";
                bw.write(row);
            }
        }

        int rand_name = (int) (Math.random() * firstname.size());
        int rand_lastname = (int) (Math.random() * lastname.size());

        double pay_in_adv = 50.00 + Math.random() * (200.00 - 50.00);
        pay_in_adv = Math.round(pay_in_adv * 100.0) / 100.0;

        String lastRow = "(" + count + ",\"" + lastname.get(rand_lastname) + "\",\"" + firstname.get(rand_name) +"\"," + 3 + pay_in_adv + ");";
        bw.write(lastRow);

        try {
            bw.close();
        } finally {
            bw.close();
        }
    }

}

