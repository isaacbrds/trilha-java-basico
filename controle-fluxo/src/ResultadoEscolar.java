public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 9;

        if(nota >= 7){
            System.out.println("Aprovado!");
        }else if(nota < 7 && nota >=5){
            System.out.println("Em recuperação!");
        }else{
            System.out.println("Reprovado!");
        }
    }
}
