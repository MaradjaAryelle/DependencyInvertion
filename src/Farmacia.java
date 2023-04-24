public class Farmacia implements InterfaceFarmacia {
    @Override
    public void comprarRemedio(String remedio) {
        System.out.println("Compra de " + remedio +"realizada!" );
    }
}
