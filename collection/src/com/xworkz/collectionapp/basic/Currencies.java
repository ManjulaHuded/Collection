package com.xworkz.collectionapp.basic;

import java.util.Collection;
import java.util.TreeSet;

public class Currencies {

	public static void main(String[] args) {

        String cur1 = "Indian Rupee";
        String cur2 = "Bitcoin";
        String cur3 = "Bahraini Dinar";
        String cur4 = "Brazilian real";
        String cur5 = "Bulgarian lev";
        String cur6 = "Canadian Dollar";
        String cur7 = "Colombian Peso";
        String cur8 = "Euro";
        String cur9 = "Croatian kuna";
        String cur10 = "Czech Krone";
        String cur11 = "Hong Kong";
        String cur12 = "Australian Dollar";
        String cur13 = "Hungarian Forint";
        String cur14 = "Icelandic krona";
        String cur15 = "Nigerian naira";
        String cur16 = "Omani rial";
        String cur17 = "Polish zloty";
        String cur18 = "Ponud sterling";
        String cur19 = "US dollar";
        String cur20 = "Thai baht";
        String cur21 = "Swiss Franc";
        String cur22 = "South African rand";
        String cur23 = "South korean won";
        String cur24 = "Swedish krona";
        String cur25 = "Qatari riyal";
        String cur26 = "Turkish lira";
        
  
        Collection<String> ref = new TreeSet<String>();
        ref.add(cur26);
        ref.add(cur25);
        ref.add(cur24);
        ref.add(cur23);
        ref.add(cur22);
        ref.add(cur21);
        ref.add(cur20);
        ref.add(cur19);
        ref.add(cur18);
        ref.add(cur17);
        ref.add(cur16);
        ref.add(cur15);
        ref.add(cur14);
        ref.add(cur13);
        ref.add(cur12);
        ref.add(cur11);
        ref.add(cur10);
        ref.add(cur9);
        ref.add(cur8);
        ref.add(cur7);
        ref.add(cur6);
        ref.add(cur5);
        ref.add(cur4);
        ref.add(cur3);
        ref.add(cur2);
        ref.add(cur1);
        
        System.out.println(ref);
        System.out.println(ref.size());
        ref.clear();
	}

}
