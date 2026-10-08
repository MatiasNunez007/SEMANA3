public class Main {
    public static void main(String[] args) {
        // EJERCICIO 3: Comprobación del contador antes de crear objetos (Paso 8)
        System.out.println("Total de dispositivos al inicio: " + Dispositivo.getTotalCreados());
        System.out.println("-------------------------------------------------");

        // EJERCICIO 3: Creación de objetos usando el constructor (Paso 4)
        Dispositivo disp1 = new Dispositivo("Servidor NAS", "Almacenamiento");
        Dispositivo disp2 = new Dispositivo("Router Cisco", "Red");

        // EJERCICIO 2: Comprobación de la validación del nombre vacío (Paso 10)
        System.out.println(">>> Intentando crear un dispositivo con nombre vacío:");
        Dispositivo disp3 = new Dispositivo("", "Periférico");

        System.out.println("\n-------------------------------------------------");

        // EJERCICIO 2: Usar setters y getters (Pasos 8 y 9)
        System.out.println("Nombre del Dispositivo 1: " + disp1.getNombre());
        System.out.println("Tipo del Dispositivo 1: " + disp1.getTipo());

        System.out.println(">>> Modificando nombre con setter inválido:");
        disp1.setNombre(""); // La consola debe arrojar el error diseñado

        // EJERCICIO 2: Probar métodos de acción del desafío (Paso 9)
        System.out.println("\n>>> Probando métodos de acción:");
        System.out.println("Estado inicial de " + disp1.getNombre() + ": " + (disp1.isActivo() ? "Activo" : "Inactivo"));
        disp1.activar();
        System.out.println("Estado actual de " + disp1.getNombre() + ": " + (disp1.isActivo() ? "Activo" : "Inactivo"));

        System.out.println("\n-------------------------------------------------");

        // EJERCICIO 3: Mostrar resultados del contador compartido y IDs (Paso 8 y Desafío 9)
        System.out.println("Total de dispositivos creados al final: " + Dispositivo.getTotalCreados());
        System.out.println("Objeto 1 -> ID " + disp1.getId());
        System.out.println("Objeto 2 -> ID " + disp2.getId());
        System.out.println("Objeto 3 -> ID " + disp3.getId());
    }
}
