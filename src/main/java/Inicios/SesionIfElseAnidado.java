package Inicios;

import java.util.Scanner;

public class SesionIfElseAnidado {
    public static void main(String[] args) {
        System.out.println("Bienvenido a tu sistema de registro de citas");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia de la semana que quieres agendar, en minuscula");
        String dia = sc.nextLine();


        if(dia.equals("lunes")){
            System.out.println("La cita se agenda para el lunes");
        } else if(dia.equals("martes")){
            System.out.println("La cita se agenda para el martes");
        } else if(dia.equals("miercoles")){
            System.out.println("La cita se agenda para el miercoles");
        }else if(dia.equals("jueves")){
            System.out.println("La cita se agenda para el jueves");
        }else if(dia.equals("viernes")){
            System.out.println("La cita se agenda para el viernes");
        } else{
            System.out.println("Resultado no esperado, solo puedes agendar dias entre semana");
        }

    }



}
