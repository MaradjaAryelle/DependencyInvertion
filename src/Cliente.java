public class Cliente {
    private InterfaceFarmacia farmacia;
    public Cliente(InterfaceFarmacia farmacia) {
        this.farmacia = farmacia;
    }
    public void realizarCompra(String remedio) {
        this.farmacia.comprarRemedio(remedio);
    }
}