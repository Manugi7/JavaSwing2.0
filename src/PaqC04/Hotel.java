package PaqC04;

import java.util.Scanner;

public class Hotel {

    private boolean disponible;
    private Reserva reserva;

    public Hotel (){

        this.disponible=true;

    }

    public Reserva getReserva() {
        return reserva;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setReserva(Reserva reserva) {
        if(reserva!=null) this.reserva = reserva;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    public int[] estaLibre (Hotel[][] h){

        int[] aux = new int[2];
        aux[0] = 10;
        aux[1] = 10;

        Hotel hotel;

        for (int i = 0; i < h.length ; i++) {

            for(int j = 0; j< h[i].length; j++){

                hotel = h[i][j];
                if(hotel.isDisponible()){

                    aux[0] = i;
                    aux[1] = j;
                    return aux;

                }

            }
        }

        return aux;

    }

    public Hotel almacena (int[] aux,Reserva r, Hotel[][] h){

        Hotel hotel;

        h[aux[0]][aux[1]].setReserva(r);
        h[aux[0]][aux[1]].setDisponible(false);

        hotel = h[aux[0]][aux[1]];

        return hotel;

    }

    public Hotel anular (Hotel[][] h, int[] aux2){

        Hotel hotel;

        h[aux2[0]-1][aux2[1]-1].reserva=new Reserva();
        h[aux2[0]-1][aux2[1]-1].disponible=true;

        hotel = h[aux2[0]-1][aux2[1]-1];

        return hotel;

    }


    public String toString(){

        if(isDisponible()){

            return "L";

        } else {

            return "R";
        }

    }

}
