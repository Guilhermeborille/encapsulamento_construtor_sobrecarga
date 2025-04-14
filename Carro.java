public class Carro{
    private String marca;
    private String modelo;
    private String placa;
    private Motor motor;
    private Condutor motorista;

    public Carro(String marca, String modelo, String placa, Motor motor, Condutor motorista){
        this. marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
        this.motorista = motorista;
    }
    public Carro(String marca, String modelo, String placa, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
    }
    public void trocar(Motor motor, Condutor motorista){
        this.motor = motor;
        this.motorista = motorista;
    }
    public void trocar(Motor motor){
        this.motor = motor;
    }
    public void trocar(Condutor motorista){
        this.motorista = motorista;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public Motor getMotor() {
        return motor;
    }
    public Condutor geCondutor(){
        return motorista;
    }
    public String toString() {
        if(this.motorista == null){
            return "Carro [marca= " + marca + ", modelo= " + modelo + ", placa= " + placa + ", tipo do motor= " + motor.getTipo() + ", potencia do motor " + motor.getPotencia() +
            ", não tem motorista" +"]";
        }
        return "Carro [marca= " + marca + ", modelo= " + modelo + ", placa= " + placa + ", tipo do motor= " + motor.getTipo() + ", potencia do motor " + motor.getPotencia() +
         ", nome do motorista= " + motorista.getNome() + ", CNH do motorista " + motorista.getCnh() +"]";
    }
    
    
}