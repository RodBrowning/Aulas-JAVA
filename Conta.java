
public class Conta {
    int numero;
    double saldo;
    double limite;
    
        /// Constructors
        
        public Conta(){
            this(0,0.0,500.00);
        }
    
        public Conta(int numero, double saldo, double limite){
            this.numero = numero;
            this.saldo = saldo;
            this.limite = limite;
        }
    
        /// Getters and Setters
        
        // Numero
        public void setNumero(int num){
            this.numero = num;
        }

        public int getNumero(){
            return numero;
        }
        
        // Saldo
        public void setSaldo(double saldo){
            this.saldo = saldo;
        }
        
        public double getSaldo(){
            return this.saldo;
        }
        
        // Limite
        public void setLimite(double limite){
             this.limite = limite;
        }
        
        public double getLimite(){
            return limite;
        }

    /// Metodos
    public void sacar(double valor){
        this.setSaldo(getSaldo() - valor);
    }
    
    public void depositar(double valor){
        this.setSaldo(getSaldo() + valor);
    }
    public double verificarSaldo(int numero){
        return numero;
    }
}
