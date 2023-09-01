package ch.iet_gibb.labelcreator.application;

public class Pelletheizung {
    protected double kWh;
    protected String Einheit;

    public Pelletheizung(double kWh, String Einheit){
        checkKWh(kWh);

        switch(Einheit){
            case "kg":
                double kg = getKg(kWh);
                System.out.println("Die Menge an kg ist: " + kg);
                break;
            case "m3":
                double m3 = getM3(getKg(kWh));
                System.out.println("Die Menge an kg ist: " + m3);
                break;
            default:
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

    private double getKg(double kWh) {
        double kg = kWh / 4.8;

        return kg;
    }

    private double getM3(double kg) {
        double m3 = kg / 650;

        return m3;
    }
}
