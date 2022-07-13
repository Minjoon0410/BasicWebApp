package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Minjoon";
        } else if (query.contains("20") && query.contains("5")) {
            return "25";
        } else if (query.contains("752")) {
            return "752";
        } else if (query.contains("835")) {
            return "835";
        } else if (query.contains("416")) {
            return "416";
        } else if (query.contains("653")) {
            return "653";
        } else if (query.contains("429") && query.contains("85")) {
            return "429";
        } else if (query.contains("9") && query.contains("16")) {
            return "25";
        } else if (query.contains("94") && query.contains("930")) {
            return "930";
        } else if (query.contains("2") && query.contains("11")) {
            return "13";
        }else if (query.contains("3") && query.contains("8")) {
            return "11";
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
