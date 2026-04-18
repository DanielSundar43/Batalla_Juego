package batallaproyect;

public class Mago extends Criatura implements Magico {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        objetivo.defender(fuerza);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un hechizo");
    }

    @Override
    public void aprenderHechizo(String hechizo) {
        System.out.println(nombre + " aprende " + hechizo);
    }
}