package dds.monedero.model;

public interface TipoMovimiento {
  double actualizarSaldo(double saldo, double monto);

  boolean isDeposito();

  boolean isExtraccion();
}
