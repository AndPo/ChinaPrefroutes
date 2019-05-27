package MainFolder;

public class Route {
    String source;
    String route;
    String Empty_field_1 = "";
    String Empty_field_2 = "";
    String Empty_field_3 = "";
    String Empty_field_4 = "";
    String Empty_field_5 = "";
    String Empty_field_6 = "";
    String Empty_field_7 = "";
    String Empty_field_8 = "";
    String firstZero;
    String Empty_field_10 = "";
    String Empty_field_11 = "";
    String mea;
    String maa;
    String jpqth;
    String country;
    String mandatory;

    public Route() {
    }

    public Route(String source, String route, String firstZero, String mea, String maa, String jpqth, String country, String mandatory) {
        this.source = source;
        this.route = route;
        this.firstZero = firstZero;
        this.mea = mea;
        this.maa = maa;
        this.jpqth = jpqth;
        this.country = country;
        this.mandatory = mandatory;
    }


}
