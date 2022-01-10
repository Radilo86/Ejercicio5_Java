public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save(Coche coche) {
        System.out.println("Metodo Save");
    }

    @Override
    public void findAll(Coche coche) {
        System.out.println("Metodo FindALL");
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Metodo Delete");
    }
}
