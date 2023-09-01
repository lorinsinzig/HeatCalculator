package ch.iet_gibb.labelcreator.application;

public class Schnitzelheizung {
    protected double kWh;
    protected String Einheit;

    public Schnitzelheizung(double kWh, String Einheit, String holzart){
        checkKWh(kWh);

        if(Einheit == "kg"){
            double kg = getKg(kWh);
            System.out.println("Die Menge an kg ist: " + kg);
        }else if(Einheit == "m3") {
            double m3 = getM3(getKg(kWh), holzart);
            System.out.println("Die Menge an m3 ist: " + m3);
        }else {
            throw new IllegalArgumentException("Die Einheit ist nicht gültig");
        }
    }
    private void checkKWh(double kWh){
        if(kWh>0){
            this.kWh = kWh;
        }else{
            throw new IllegalArgumentException("Die kWh Zahl muss grösser als 0 sein");
        }
    }

    private double getKg(double kWh){
        double kg = kWh * 0.25;

        return kg;
    }

    private double getM3(double kg, String holzart) {
        double m3;

        if(holzart == "Buche"){
            m3 = kg / 500;
            return m3;
        }else if(holzart == "Tanne") {
            m3 = kg / 400;
            return m3;
        }else if(holzart == "Gemischt") {
            m3 = kg / 425;
            return m3;
        }else{
            throw new IllegalArgumentException("Die Holzart ist nicht gültig");
        }
    }
}
