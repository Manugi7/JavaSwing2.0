package PaqC04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Reserva r = new Reserva();
        Hotel h = new Hotel();
        Hotel[][] hotel = new Hotel[8][6];
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        for (int i = 0; i < hotel.length ; i++) {

            for (int j = 0; j < hotel[i].length; j++) {

                hotel[i][j] = new Hotel();

            }

        }

        mostrar(hotel);

        while (a == 0) {

            System.out.println("\n1) HACER RESERVA");
            System.out.println("\n2) ANULAR RESERVA");
            System.out.println("\n3) SALIR");
            System.out.println("\nElige una opcion: ");
            b = sc.nextInt();

            switch(b){

                case 1 : reserva(r,h,hotel); break;

                case 2 : int[] aux3; aux3=datosAnular(); hotel[aux3[1]-1][aux3[0]-1]=h.anular(hotel,aux3); mostrar(hotel); break;

                case 3: a=1; break;

            }




        /*
        System.out.println(r.getNombre());
        System.out.println(r.getApellidos());
        System.out.println(r.getDNI());
        System.out.println(r.getTlf());
        System.out.println(r.getTarjeta());
        System.out.println(r.getEntrada());
        System.out.println(r.getSalida());
        System.out.println(r.getRegimen());
        */

        }


    }

    public static void reserva(Reserva r, Hotel h, Hotel[][] hotel) {

        int b = 0;

        int[] aux = h.estaLibre(hotel);

        if (aux[0] == 10 && aux[1] == 10) {

            System.out.println("\nNo hay habitaciones disponibles");

        } else {

            System.out.println("\nLa habitacion libre es: " + (aux[1] + 1) + " en la planta: " + (aux[0] + 1));

        }

        r.reservar();
        hotel[aux[0]][aux[1]] = h.almacena(aux, r, hotel);
        System.out.println("Ha reservado la habitacion: " + (aux[1]+1) + " de la planta: " + (aux[0] + 1));

        for (int i = 7; i >= 0; i--) {

            System.out.print("|");

            for (int j = 5; j >= 0; j--) {

                System.out.print(hotel[i][j]);
                if (j != hotel[i].length + 1) {

                    System.out.print("\t");

                }

            }

            System.out.println("|" + (1 + i));
        }

        System.out.print(" ");
        for(int i=0;i<hotel[hotel.length-1].length;i++) {
            System.out.print((6-i) + "\t");
        }


    }

    public static void mostrar(Hotel[][] hotel){

        for (int i = 7; i >= 0; i--) {

            System.out.print("|");

            for (int j = 5; j >= 0; j--) {

                System.out.print(hotel[i][j]);
                if (j != hotel[i].length + 1) {

                    System.out.print("\t");

                }

            }

            System.out.println("|" + (1 + i));
        }

        System.out.print(" ");
        for(int i=0;i<hotel[hotel.length-1].length;i++) {
            System.out.print((6-i) + "\t");
        }

    }

    public static int[] datosAnular (){

        int aux = 0;

        int[] aux2 = new int[2];
        aux2[0] = 0;
        aux2[1] = 0;

        Scanner sc = new Scanner(System.in);

        while(aux==0){

            System.out.println("Introduce tu numero de habitacion: ");
            aux2[0] = sc.nextInt();
            System.out.println("Introduce el numero de planta: ");
            aux2[1] = sc.nextInt();

            if(aux2[0]>0 && aux2[1]>0 && aux2[0]<7 && aux2[1]<9){

                aux=1;

            } else {

                System.out.println("Introduce un nombre valido");

            }

        }


        return aux2;

    }


}