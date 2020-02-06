package edu.touro.mco264;

import java.util.Comparator;

public class Gematria implements Comparator<String> {

    static String[] words = {"typeset", "retain", "mellow", "toothsome", "nose",
                        "remove", "shave", "cease", "befitting", "determine",
                        "tent", "bury", "zinc"};

    //static int[] wordValues = new int[13];


    public static int gematriaVal(String s)
    {
        String key = " abcdefghijklmnopqrstuvwxyz";
        // use charAt to find each letter's value in the key variable.

        int stringValue = 0;

        for(int i = 0; i < s.length(); i++){
            stringValue += key.indexOf(s.charAt(i));
        }

        return stringValue;
    }


    @Override
    public int compare(String o1, String o2) {

        String s1 = o1.toLowerCase(), s2 = o2.toLowerCase();

        int g1 = gematriaVal(s1);
        int g2 = gematriaVal(s2);

        // This - That
        return g1-g2;
    }


    public void sort(String[] listSort){

        for(int i = 0; i < listSort.length - 1; i++){
            for(int j = 1; j < listSort.length; j++){

                if( gematriaVal(listSort[j - 1]) > gematriaVal(listSort[j]) ){
                    String temp = listSort[j - 1];
                    listSort[j - 1] = listSort[j];
                    listSort[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {


        //sort(words); <-- Commented out for the test method.

        for(String str: words){
            System.out.println(str);
        }
    }
}
