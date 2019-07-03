package main.java.com.stackroot.pe3;

public class PlacesWithoutVowels {
    //To remove the vowels in the given string
        public static String[] convertPlaceNamesWithoutVowels(String[] places) {

            for (int i = 0; i < places.length; i++) {
                places[i]= places[i].replaceAll("[aeiouAEIOU]", "");
            }
            return places;
        }
    }

