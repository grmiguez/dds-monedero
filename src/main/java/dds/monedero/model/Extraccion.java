package dds.monedero.model;

public class Extraccion implements TipoMovimiento {

  @Override
  public double actualizarSaldo(double saldo, double monto) {
    return saldo - monto;
  }

  @Override
  public boolean isDeposito() {
    return false;
  }

  @Override
  public boolean isExtraccion() {
    return true;
  }

}
