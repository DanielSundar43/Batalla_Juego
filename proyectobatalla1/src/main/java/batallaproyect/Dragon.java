package batallaproyect;

public class Dragon extends Criatura implements Volador {

    public Dragon(String nombre, int salud, int fuerza) {

        super(nombre, salud, fuerza);

    }

    @Override

    public void atacar(Criatura objetivo) {

        int daño = fuerza * 2;

        objetivo.defender(daño);

    }

    @Override

    public void defender(int daño) {

        salud -= daño;

    }

    @Override

    public void volar() {

        System.out.println(nombre + " está volando");

    }

    @Override

    public void aterrizar() {

        System.out.println(nombre + " aterriza");

    }

}
 
