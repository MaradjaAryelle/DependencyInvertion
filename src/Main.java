public class Main {
    public static void main(String[] args) {
        InterfaceFarmacia farmacia = new Farmacia();
        Cliente cliente = new Cliente(farmacia);
        cliente.realizarCompra("Dipirona");
    }
}