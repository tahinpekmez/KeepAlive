package Survival;

import java.util.Formatter;

public class Results {

    private Formatter formatter;

    public void openFile(){

        try {
            formatter = new Formatter("results.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addRecors(String str){

        formatter.format(str);
    }

    public void closeFile(){
        formatter.close();
    }
}
