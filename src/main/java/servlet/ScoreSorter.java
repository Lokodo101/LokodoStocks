package servlet;

import java.util.Comparator;

public class ScoreSorter implements Comparator<String> {

    public int compare(String s1, String s2) {
        String[] s1Splitter = s1.split(" -- ");
        String[] s2Splitter = s2.split(" -- ");

        float s1float = Float.parseFloat(s1Splitter[0]);
        float s2float = Float.parseFloat(s2Splitter[0]);

        if (s1float < s2float) {

            return -1;

        }else if (s1float > s2float){


            return 1;

        }
        else{

            return 0;
        }


    }

}
