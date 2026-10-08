public class Dispositivo {
    // EJERCICIO 2: Atributos protegidos con private (Paso 1)
    private String nombre;
    private String tipo;
    private boolean activo;

    // EJERCICIO 3: Atributo estático compartido y desafío de ID (Paso 5 y 9)
    private static int contador = 0;
    private int id;

    // EJERCICIO 3: Constructor (Paso 2)
    public Dispositivo(String nombre, String tipo) {
        // Utilizamos el setter para que la validación aplique desde la creación
        setNombre(nombre);
        this.tipo = tipo;
        this.activo = false; // Valor por defecto

        // Incrementamos el contador por cada objeto creado (Paso 6)
        contador++;
        // Desafío: Asignamos el valor actual del contador como ID único
        this.id = contador;
    }

    // EJERCICIO 2: Getters y Setters utilizando "this" (Paso 4, 5 y 6)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // Validación: Evitar guardar un nombre vacío (Paso 7)
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre del dispositivo no puede estar vacío.");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Nota: Para booleanos se usa 'is' en lugar de 'get' por convención
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // EJERCICIO 2: Desafío adicional - Métodos que representan una acción real (Paso 9)
    public void activar() {
        this.activo = true;
        System.out.println(this.nombre + " ha sido activado.");
    }

    public void desactivar() {
        this.activo = false;
        System.out.println(this.nombre + " ha sido desactivado.");
    }

    // EJERCICIO 3: Método estático para consultar la información de clase (Paso 7)
    public static int getTotalCreados() {
        return contador;
    }

    // Getter para el ID del desafío
    public int getId() {
        return id;
    }
}