public class Empregado{
        private String nome;
        private int idade;
        private int tipo;
        private double salario;
        private double comissao;
        private double bonus;

        public double calculoSalario()
        {
                if(tipo == 1){
                        return salario;
                }
                else if(tipo == 2){
                             return salario + salario * comissao;
                }
                else if(tipo == 3){
                             return salario + bonus;
                }
                else {
                       return 0;
                }
        }

        public void setNome(String nome)
        {
                this.nome = nome;
        }
        
        public String getNome()
        {
                return
        }

        public void setIdade(int idade)
        {
                this.idade = idade;
        }
        
        public int getIdade()
        {
                return
        }
}