import java.io.*;

public class Main{
    static void main() {
        Producto producto = new Producto("Sol Ring", 1, 2.5);

        {
            try {
                FileOutputStream fileOut = new FileOutputStream("serial");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(producto);
                out.close();
                fileOut.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Producto producto2 = null;
            try {
                FileInputStream fileIn = new FileInputStream("serial");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                producto2 = (Producto) in.readObject();
                in.close();
                fileIn.close();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        productoTransient productoT = new productoTransient("Sol Ring", 100, 2.5);

        {
            try {
                FileOutputStream fileOut = new FileOutputStream("serial");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(productoT);
                out.close();
                fileOut.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        productoTransient producto2T = null;
        try {
            FileInputStream fileIn = new FileInputStream("serial");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            producto2T = (productoTransient) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Objeto Producto cargado desde 'serial'");
        System.out.println("Nombre: " + producto2T.nome);
        System.out.println("num1: " + producto2T.num1);
        System.out.println("num2: " + producto2T.num2);

       /* System.out.println("Objeto Producto cargado desde 'serial'");
        System.out.println("Nombre: " + producto.nome);
        System.out.println("num1: " + producto.num1);
        System.out.println("num2: " + producto.num2);*/
        }
    }

