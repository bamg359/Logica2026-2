package notasdelogica;

public class ForEach {

    public static void main(String[] args) {

        int [] number = {1,2,3,4,5,6,7,8,9,10};

        String [] cities = {"Medellín" , "Sabaneta" , "Envigado" , "Bello" , "Girardota", "Barbosa" , "Copacabana" , "Itaguí" , "La Estrella" , "Caldas" };

        int i = 0;
        for(String city : cities){
            System.out.println(number[i] + "->" + city);
            i++;
        }





    }



}
