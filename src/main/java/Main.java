import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main{
    static void main() throws IOException {

        Producto producto = new Producto("Sol Ring", 10, 2.5);
        FileOutputStream datos = new FileOutputStream("producto.dat");
        ObjectOutputStream salida = new ObjectOutputStream(datos);
        salida.writeObject(producto);
    }
}
