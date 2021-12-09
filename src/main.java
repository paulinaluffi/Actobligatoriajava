import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String nombre, apellido, edad, hobbie, editor, sistema;
        System.out.println("Ingrese su nombre");
        nombre = sr.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = sr.nextLine();
        System.out.println("Ingrese su edad");
        edad = sr.nextLine();
        System.out.println("Ingrese su hobbie");
        hobbie = sr.nextLine();
        System.out.println("Ingrese su editor de código preferido");
        editor = sr.nextLine();
        System.out.println("Ingrese su sistema operativo preferido");
        sistema = sr.nextLine();
        System.out.println("Usted se llama " + nombre + " "+ apellido + ", tiene " + edad + " años, su hobbie es " + hobbie + ", su editor de código preferido es " + editor + " y su sistema perativo preferido es " + sistema);
    }
}
