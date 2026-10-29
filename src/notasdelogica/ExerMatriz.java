package notasdelogica;

public class ExerMatriz {


    public static void main(String[] args) {


        String [][] usuarios = new String[4][6];

        String [] encabezados = {"id", "name", "lastName" , "email" , "phone" , "password"};

        usuarios[0][0]= "1";
        usuarios[0][1]= "Pepe";
        usuarios[0][2]= "Perez";
        usuarios[0][3] = "pp@mail.com";
        usuarios[0][4] = "3214567890";
        usuarios[0][5] = "xyz12345";

        usuarios[1][0]= "2";
        usuarios[1][1]= "Maria";
        usuarios[1][2]= "Perez";
        usuarios[1][3] = "maria@mail.com";
        usuarios[1][4] = "3214567891";
        usuarios[1][5] = "xyz12345";

        usuarios[2][0]= "3";
        usuarios[2][1]= "John";
        usuarios[2][2]= "Doe";
        usuarios[2][3] = "jd@mail.com";
        usuarios[2][4] = "3214567892";
        usuarios[2][5] = "xyz12346";

        usuarios[3][0]= "4";
        usuarios[3][1]= "Mary";
        usuarios[3][2]= "Jane";
        usuarios[3][3] = "mj@mail.com";
        usuarios[3][4] = "3214567893";
        usuarios[3][5] = "xyz12347";

        for(int i = 0; i < usuarios.length ; i++){
            for(int j= 0 ; j < usuarios[i].length ; j++){
                System.out.print(usuarios[i][j] + " ");
            }
            System.out.println();
        }





    }
}
