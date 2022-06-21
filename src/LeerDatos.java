import java.util.Scanner;

public class LeerDatos {
   static int a, b, c;
    public void LeerDatos(){

        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de A:");
        a = Teclado.nextInt();
        System.out.println("Ingrese el valor de B:");
        b = Teclado.nextInt();
        System.out.println("Ingrese el valor de C:");
        c = Teclado.nextInt();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
