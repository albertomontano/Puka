package Inicios;

import java.util.Scanner;

public class SegundaSesionPuka {
    public static void main(String[] args) {
        System.out.println("Bienvenido a tu sistema de registro de citas");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario");
        String usuario = sc.nextLine();
        System.out.println("ingresa tu contraseña");
        String password = sc.nextLine();

        if(password.equals("toyprogramando#") ){

            System.out.println("Bienvenida a tu sesión" + usuario);

            System.out.println("Dime tu edad ");
            int edad = sc.nextInt();


            if(edad == 18){
                System.out.println("Tienes 18 años");
            } else {
                System.out.println("No tienes 18 años, tienes otra edad");
            }

        } else {
            System.out.println("Tu contraseña es incorrecta");
        }

       // System.out.println("Hola, bienvenido a tu sesión" + usuario);


    }

}
