package dds.monedero.model;

public class Deposito implements TipoMovimiento {

  @Override
  public double actualizarSaldo(double saldo, double monto) {
    return saldo + monto;
  }

  @Override
  public boolean isDeposito() {
    return true;
  }

  @Override
  public boolean isExtraccion() {
    return false;
  }

}
