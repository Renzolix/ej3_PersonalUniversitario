public class PersonalNoDocente extends PersonalUniversitario {
    private int horasExtras;
    private double montoHoraExtra;

    public PersonalNoDocente(double sueldoBase, int horasExtras, double montoHoraExtra) {
        super(sueldoBase);
        this.horasExtras = horasExtras;
        this.montoHoraExtra = montoHoraExtra;
    }

    @Override
    public double calcularSueldoCobrar() {
        return sueldoBase + (horasExtras * montoHoraExtra);
    }
}