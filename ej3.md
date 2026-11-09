# Ejercicio 3: PersonalUniversitario

## Explicación Lógica
1. **Desacoplamiento:** El servicio `LiquidacionSueldos` trabaja recibiendo como argumento una referencia de la clase abstracta `PersonalUniversitario`.
2. **Ligadura Tardía (Dynamic Binding):** La JVM determina automáticamente en tiempo de ejecución qué método `calcularSueldoCobrar()` ejecutar en función del objeto real recibido por parámetro.