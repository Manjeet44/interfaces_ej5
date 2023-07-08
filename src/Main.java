// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /**
     * Crear una interfaz CocheCRUD.
     *
     * Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
     *
     * Como métodos de CocheCRUD podemos poner:
     *
     * save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
     *
     * Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
     *
     * Ejemplo:
     *
     * CocheCRUD cocheCrud = new CocheCRUDImpl()
     * @param args
     */
    public static void main(String[] args) {
        CocheCRUD coche = new CocheCRUDImpl();
        coche.save();
        coche.findAll();
        coche.delete();
    }
}