public class Tienda {
    public static void main(String[] args) {

        Producto Portatil = new Producto("Lenovo" ,10000,28 );
        Producto Celular = new Producto("Samsung", 5000, 8);
        Producto Baflecito = new Producto();

        // computador
        System.out.println("Precio inicial del producto: ");
        Portatil.Mostrar();

        Portatil.aplicarDescuento(10);

        System.out.println("Precio con descuento:");
        Portatil.Mostrar();

        System.out.println("\nVenta de 3 computadores:");
        Portatil.vender(3);
        Portatil.Mostrar();

        // celular
        System.out.println("\nVender mas de lo disponible:");
        Celular.vender(10);
        Celular.Mostrar();

        //baflecito get - set
        Baflecito.setNombre("Baflecito JBL");
        Baflecito.setPrecio(2500);
        Baflecito.setStock(8);


        Baflecito.Mostrar();
        Baflecito.aplicarDescuento(3);

        System.out.println("Precio con descuento:");
        Baflecito.Mostrar();

        System.out.println("\nVenta de 1 Baflecito:");
        Baflecito.vender(1);
        Baflecito.Mostrar();

    }
}
