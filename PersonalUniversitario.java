public abstract class PersonalUniversitario {
    protected double sueldoBase;

    public PersonalUniversitario(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularSueldoCobrar();
}