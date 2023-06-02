package poo;

public class Main {
    
    public static void main(String[] args) {
        String [] comidasfavoritas = new String [5];
          comidasfavoritas [0] = "Cuscuz";
          comidasfavoritas [1] = "Feijão";
          comidasfavoritas [2] = "Ovo";
          comidasfavoritas [3] = "Pizza";
          comidasfavoritas [4] = "Pave";

        int [] idadesPessoasFamilia = new int [3];
          idadesPessoasFamilia [0] = 44;
          idadesPessoasFamilia [1] = 41;
          idadesPessoasFamilia [2] = 13;

        double [] medias1ano = new double [10];
          medias1ano [0] = 8.0;
          medias1ano [1] = 10.0;
          medias1ano [2] = 8.0;
          medias1ano [3] = 7.5;
          medias1ano [5] = 9.0;
          medias1ano [6] = 8.0;
          medias1ano [7] = 9.5;
          medias1ano [8] = 10.0;
          medias1ano [9] = 9.0;
  int tamanho = comidasfavoritas.length;
  System.out.println("Quantidade de comidas favoritas: " + tamanho); 

      /* 1º opçao */
   System.out.println("1º elemento do primeiro arrays: " + comidasfavoritas [0]);
   System.out.println("1º elemento do segundo arrays: " + idadesPessoasFamilia [0]);
   System.out.println("1º elemento do terceiro arrays: " + medias1ano [0]);
   System.out.println("3º elemento dos favoritos: " + comidasfavoritas [2]);
   System.out.println("2º elemento do segundo arrays: " + idadesPessoasFamilia [1]);
   System.out.println("8º elemento do médias: " + medias1ano [7]);
     int ultimoIndiceMedia = medias1ano.length -1;
   System.out.println("último elemento do médias: " + ultimoIndiceMedia);
     int ultimoIndiceFavoritos = comidasfavoritas.length -1;
   System.out.println("último elemento dos favoritos: " + ultimoIndiceFavoritos);

     /* 2º opção */
   comidasfavoritas [0] = "";
   medias1ano [3] = 0.0;

     /* 3º opção */
   idadesPessoasFamilia [0] = 34;
   idadesPessoasFamilia [1] = 24;

  for(int i =0; i <= idadesPessoasFamilia.length -1; i++) {
    System.out.println(idadesPessoasFamilia[i]);
}
   }  
}
