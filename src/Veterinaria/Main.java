package Veterinaria;

public class Main {
    public static void main(String[] args){
        Mascota[] veterinaria = new Mascota[4];
        veterinaria[0] = new Mascota("Luna","Perro",28.5,9);
        veterinaria[1] = new Mascota("Michi","Gato",4.2,3);
        veterinaria[2] = new Mascota("Rocky","Perro",12.0,5);
        veterinaria[3] = new Mascota("Pepa","Conejo",2.1,1);
        int totalRecaudado = 0;
        for (int i = 0; i < veterinaria.length;i++){
          Mascota m = veterinaria[i];
          System.out.println(m.descripcion()+" valor consulta: $"+m.valorConsulta());
          totalRecaudado = totalRecaudado + m.valorConsulta();
        }
        System.out.println("Total recaudado: $"+totalRecaudado);

        veterinaria[1].setPeso(-3.0);
        System.out.println(veterinaria[1].descripcion());
    }
}
