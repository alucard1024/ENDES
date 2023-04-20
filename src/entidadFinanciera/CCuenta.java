package entidadFinanciera;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alemberg
 */





public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
    
    //  Ecapsulado 
    
     public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    

    /**
     * Get the value of ERRORCANTIDADNEGATIVA
     *
     * @return the value of ERRORCANTIDADNEGATIVA
     */
    public String getERRORCANTIDADNEGATIVA() {
        return ERRORCANTIDADNEGATIVA;
    } 

    /**
     * Constructor vacio
     */
    public CCuenta()
    {
    }

    /**
     * Construtor con todos los atributos
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Metodo que devuelve el saldo 
     * @return saldo
     */
    public double estado(){
        return this.saldo;
    }

    /**
     * Metodo para ingresar dinero en la cuenta, suma la cantidad al saldo
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Metodo para retirar dinero en la cuenta, resta la cantidad al saldo
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

   
}


    
   