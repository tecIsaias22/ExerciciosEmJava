
public class NumerosPrimos {
    public static void main(String[] args) {
int Nu= 4;
int con = 0;
           //inicio
        for(int i = 2; i < Nu; i++){

            if(Nu % i ==0){
                con++;
            }
        }
        if(con == 0){
            System.out.println("È Primo");
        }else{
            System.out.println("Nâo e Primo");
        }
    }
}
