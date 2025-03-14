public class Producto {

    private String Nombre;
    private double Precio;
    private int Stock;

    public Producto() {
    }

    public Producto(String nombre, double precio, int stock) {
        Nombre = nombre;
        Precio = precio;
        Stock = stock;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Nombre='" + Nombre + '\'' +
                ", Precio=" + Precio +
                ", Stock=" + Stock +
                '}';
    }
    public void aplicarDescuento (double porcentaje){
        if (porcentaje > 0 && porcentaje <= 100) {
            double descuento = Precio * (porcentaje / 100);
            Precio -= descuento;
        } else {
            System.out.println("Porcentaje de descuento no válido.");
        }
    }
    public void vender (int cantidad){
        if (cantidad > 0 && cantidad <= Stock) {
            Stock -= cantidad;
        } else {
            System.out.println("Stock insuficiente o cantidad inválida.");
        }
    }
    public void Mostrar(){
        System.out.println("Nombre del producto: "+ this.Nombre);
        System.out.println("Productos disponibles: "+ this.Stock);
        System.out.println("El precio es: "+ this.Precio);
        System.out.println("------------------------------------");

    }
}
