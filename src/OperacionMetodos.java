public class OperacionMetodos {
    LeerDatos leerDatos = new LeerDatos();
    int p;
   static double area;

    public double getArea() {
        return area;
    }

    public void P(){
        p = (leerDatos.getA()+ leerDatos.getB()+ leerDatos.getC()) / 2;
        System.out.println("P = "+p);
    }
    public void Area(){
        area = Math.sqrt(p*((p- leerDatos.getA())*(p- leerDatos.getB())*(p- leerDatos.getC())));
    }
}
