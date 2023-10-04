package class12;

public class HW2 {

    String lanuages(String country) {
        if (country.equalsIgnoreCase("United States")) {
            return ("Hello");
        } else if (country.equalsIgnoreCase("Mexico")) {
            return ("Hola");
        } else if (country.equalsIgnoreCase("Egypt")) {
            return ("salam");
        } else if (country.equalsIgnoreCase("Canada")) {
            return("hiya");
        }else {
            return ("dont know this language");
        }

    }
}



