public class productoTransient implements  java.io.Serializable {
    String nome;
    transient int num1;
    double num2;

    public productoTransient(String nome, int num1, double num2) {
        this.nome = nome;
        this.num1 = num1;
        this.num2 = num2;

    }

    public String getNombre() {
        return nome;
    }

    public int getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nome='" + nome + '\'' +
                ", num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
