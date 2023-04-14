package org.example.papeterie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoFacture {

    public static void main() {

        Stylo s1 = new Stylo("s1", "BIC", 1, "Test1", "Noir");
        Stylo s2 = new Stylo("s2", "None", 2, "Test2", "Or");
        Ramette r1 = new Ramette("r1", "Ramette haute qualité", 50, "Clairefontaine", 80);

        List<Article> articles = new ArrayList<Article>();

        articles.add(s1);
        articles.add(s2);
        articles.add(r1);

        Map<String,List<Article> > map = new HashMap<>();

        map.put(s1.getReference(), articles);
    }

}
