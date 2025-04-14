public class Main {
    public static void main(String[] args){
        Condutor motorista1 = new Condutor("gui", "cnh");
        Condutor motorista2 = new Condutor("elisangela" , "123456");

        Motor motor1 = new Motor("gasolina" , "145 cv");
        Motor motor2 = new Motor ("eletrico", "135 cv");
        Motor motor3 = new Motor("diesel", "300 cv");

        Carro carro1 = new Carro("fiat", "kwid" , "ab123", motor1, motorista1);
        Carro carro2 = new Carro("BMW", "BMW 320i M Sport", "CHT76A", motor2);

        System.out.println(carro1.toString());
        System.out.println(carro2.toString());

        carro1.trocar(motor3, motorista2);
        System.out.println("\n"+carro1.toString() +"\n");
        carro2.trocar(motorista1);
        System.out.println(carro2.toString());



    }
}
