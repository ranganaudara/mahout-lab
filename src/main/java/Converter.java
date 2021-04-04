import java.io.*;

public class Converter {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/input/u.data"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/input/movies.csv"));

            String line;
            while((line = br.readLine()) != null){
                String[] values = line.split("\\t", -1);
                bw.write(values[0]+","+values[1]+","+values[2]+"\n");
            }

            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
