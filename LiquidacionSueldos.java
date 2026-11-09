public class LiquidacionSueldos {

    public void procesarPago(PersonalUniversitario p) {
        System.out.println("Procesando pago de haberes...");
        // Invocación polimórfica (Dynamic Binding)
        double total = p.calcularSueldoCobrar();
        System.out.println("-> Monto total a depositar: $" + total + "\n");
    }

    public static void main(String[] args) {
        LiquidacionSueldos liquidacion = new LiquidacionSueldos();

        PersonalUniversitario profe = new ProfesorTitular(450000.0, 120000.0);
        PersonalUniversitario noDocente = new PersonalNoDocente(380000.0, 15, 3500.0);

        liquidacion.procesarPago(profe);
        liquidacion.procesarPago(noDocente);
    }
}