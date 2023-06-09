package presencial.clase7_flyweight_computadoras;

public class Cliente {
    public static void main(String[] args){
        //Creamos una fabrica
        ComputadoraFactory computadoraFactory = new ComputadoraFactory();
        //Creamos las computadoras
        Computadora pc1 = computadoraFactory.getComputadora(16,500);
        Computadora pc2 = computadoraFactory.getComputadora(8,500);
        Computadora pc3 = computadoraFactory.getComputadora(16,500);
        Computadora pc4 = computadoraFactory.getComputadora(8,500);

        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);
        System.out.println(pc4);

        System.out.println("Cantidad de objetos"+Computadora.getContador());
        //Output cantidad de objetos son 2 porque quita los repetidos

        pc4.setRam(9);
        System.out.println(pc2);
        System.out.println(pc4);
        System.out.println("Cantidad de objetos"+Computadora.getContador());
        //Siguen siendo 2 pero como le cambiamos la ram a la 4, modifico todas porque las dos apuntan al mismo espacio de memoria

    }
}
