package responsabilidad;

public class ManejadorCreditoConcreto implements ManejadorCredito {
    private ManejadorCredito siguiente;

    @Override
    public void establecerSiguiente(ManejadorCredito siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void manejarCredito(int monto) {
        manejarCreditoEjecutivo(monto);
    }

    private void manejarCreditoEjecutivo(int monto) {
        int MONTO_MINIMO_EJECUTIVO = 0;
        int MONTO_MAXIMO_EJECUTIVO = 10000;

        if (monto >= MONTO_MINIMO_EJECUTIVO && monto <= MONTO_MAXIMO_EJECUTIVO) {
            System.out.println("El crédito fue aprobado por el ejecutivo de cuenta.");
        } else {
            manejarSiguiente(monto);
        }
    }

    private void manejarCreditoLider(int monto) {
        int MONTO_MINIMO_LIDER = 10001;
        int MONTO_MAXIMO_LIDER = 50000;

        if (monto >= MONTO_MINIMO_LIDER && monto <= MONTO_MAXIMO_LIDER) {
            System.out.println("El crédito fue aprobado por el líder inmediato del ejecutivo.");
        } else {
            manejarSiguiente(monto);
        }
    }

    private void manejarCreditoGerente(int monto) {
        int MONTO_MINIMO_GERENTE = 50001;
        int MONTO_MAXIMO_GERENTE = 100000;

        if (monto >= MONTO_MINIMO_GERENTE && monto <= MONTO_MAXIMO_GERENTE) {
            System.out.println("El crédito fue aprobado por el gerente.");
        } else {
            manejarSiguiente(monto);
        }
    }

    private void manejarCreditoDirector(int monto) {
        int MONTO_MINIMO_DIRECTOR = 100001;

        if (monto >= MONTO_MINIMO_DIRECTOR) {
            System.out.println("El crédito fue aprobado por el director.");
        } else {
            System.out.println("El crédito no pudo ser aprobado por ningún responsable.");
        }
    }

    private void manejarSiguiente(int monto) {
        if (siguiente != null) {
            siguiente.manejarCredito(monto);
        }
    }
}
