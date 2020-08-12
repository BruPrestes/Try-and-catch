package excecoes;

public class excecao {
    
    public static void main(String[] args) {
        
        
        try{
        int[] vetor = new int[4];
        
        //A linha de baixo será mostrada, pois não ocorreu nada
        // de diferente 
        System.out.println("Antes da exception");
        
        //Essa linha não será mostrada pois ocorrerá um erro 
        //no vetor
        vetor[4] = 1;
        
        System.out.println("Esse texto não será impresso");
        //A partir de baixo será exibido o que vai proceder
        //quando ocorrer um erro de excecao de array
        
        //ou seja
        
        //Se o erro ocorrer irá ser executado uma lógica
        } catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceção ao acessar um índice do vetor"
                    + "que não existe");
        }
        //Aqui será mostrado normalmente
        System.out.println("Esse texto será impresso"
                + "após a exception");
    }
}
