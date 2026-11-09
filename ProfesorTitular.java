public class ProfesorTitular extends PersonalUniversitario {
    private double bonoInvestigacion;

    public ProfesorTitular(double sueldoBase, double bonoInvestigacion) {
        super(sueldoBase);
        this.bonoInvestigacion = bonoInvestigacion;
    }

    @Override
    public double calcularSueldoCobrar() {
        return sueldoBase + bonoInvestigacion;
    }
}