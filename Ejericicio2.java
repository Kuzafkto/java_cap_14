/*
 * Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
Este método debe comprobar que los gatos son de distinto sexo, tras lo
cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
= garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
programa desde el que se pruebe el método.

@author KuzaFkto
 */
public class Ejericicio2 {
    public static void main(String[] args) {
        Gato macho=new Gato(Sexo.MACHO);
        Gato machoMentira=new Gato(Sexo.HEMBRA);
        Gato hembra=new Gato(Sexo.HEMBRA);
        try{
            Gato cria= machoMentira.apareaCon(hembra);
            System.out.print("ok");

        }catch(ExcepcionApareamientoImposible impapa){
            System.out.println("Ambos son del mismo sexo");
        }
    }
}
