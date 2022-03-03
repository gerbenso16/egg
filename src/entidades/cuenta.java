
package entidades;


public class cuenta {
   
    public int numerodecuenta;
    public double saldo_actual, ingreso, ratirar, extraxccionRapida,consultarSaldo,consultarDatos;
    public double setSaldo_actual;
    public cuenta() {
    }

    public cuenta(int numerodecuenta, double saldo_actual, double ingreso, double ratirar, double extraxccionRapida, double consultarSaldo, double consultarDatos) {
        this.numerodecuenta = numerodecuenta;
        this.saldo_actual = saldo_actual;
        this.ingreso = ingreso;
        this.ratirar = ratirar;
        this.extraxccionRapida = extraxccionRapida;
        this.consultarSaldo = consultarSaldo;
        this.consultarDatos = consultarDatos;
    }

    public int getNumerodecuenta() {
        return numerodecuenta;
    }

    public void setNumerodecuenta(int numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getRatirar() {
        return ratirar;
    }

    public void setRatirar(double ratirar) {
        this.ratirar = ratirar;
    }

    public double getExtraxccionRapida() {
        return extraxccionRapida;
    }

    public void setExtraxccionRapida(double extraxccionRapida) {
        this.extraxccionRapida = extraxccionRapida;
    }

    public double getConsultarSaldo() {
        return consultarSaldo;
    }

    public void setConsultarSaldo(double consultarSaldo) {
        this.consultarSaldo = consultarSaldo;
    }

    public double getConsultarDatos() {
        return consultarDatos;
    }

    public void setConsultarDatos(double consultarDatos) {
        this.consultarDatos = consultarDatos;
    }

    @Override
    public String toString() {
        return "cuenta{" + "numerodecuenta= " + numerodecuenta + ", saldo_actual= " + saldo_actual + ", ingreso= " + ingreso + ", ratirar= " + ratirar + ", extraxccionRapida= " + extraxccionRapida + ", consultarSaldo= " + consultarSaldo + ", consultarDatos= " + consultarDatos + '}';
    }
    
    
    

    
    
    
    
    
}
