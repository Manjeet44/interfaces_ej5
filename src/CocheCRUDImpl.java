public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("Estas en el metodo Save.");
    }

    @Override
    public void findAll() {
        System.out.println("Estas en el metodo FindAll.");
    }

    @Override
    public void delete() {
        System.out.println("Estas en el metodo delete.");
    }
}
