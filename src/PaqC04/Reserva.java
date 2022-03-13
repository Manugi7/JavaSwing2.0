package PaqC04;

import java.util.Scanner;

public class Reserva {

    private int DNI;
    private String nombre;
    private String apellidos;
    private int tlf;
    private int tarjeta;
    private Fecha entrada,salida;
    private int regimen;

    public Reserva(){



    }

    public Fecha getEntrada() {
        return entrada;
    }

    public Fecha getSalida() {
        return salida;
    }

    public int getDNI() {
        return DNI;
    }

    public int getRegimen() {
        return regimen;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public int getTlf() {
        return tlf;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setEntrada(Fecha entrada) {
        this.entrada = entrada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRegimen(int regimen) {
        this.regimen = regimen;
    }

    public void setSalida(Fecha salida) {
        this.salida = salida;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }


    public void reservar(){

        int aux=0;
        int d,m,y;
        Fecha fe = new Fecha();
        Fecha fs = new Fecha();
        int r;
        Scanner sc = new Scanner(System.in);

        while(aux==0){

            System.out.println("Introduce tu nombre: ");
            this.nombre = sc.nextLine();

            if(this.nombre!=null && this.nombre!=""){

                aux=1;

            } else {

                System.out.println("Introduce un nombre valido");

            }

        }

        aux=0;

        while(aux==0){

            System.out.println("Introduce tus apellidos: ");
            this.apellidos = sc.nextLine();

            if(this.apellidos!=null && this.apellidos!=""){

                aux=1;

            }else{

                System.out.println("Introduce unos apellidos validos");

            }


        }

        aux=0;

        while(aux==0){

            System.out.println("Introduce tu DNI: ");
            this.DNI = sc.nextInt();

            if(this.DNI>0){

                aux=1;

            }else{

                System.out.println("Introduce un DNI valido");

            }


        }

        aux=0;

        while(aux==0){

            System.out.println("Introduce tu telefono: ");
            this.tlf = sc.nextInt();

            if(this.tlf>0){

                aux=1;

            }else{

                System.out.println("Introduce un telefono valido");

            }

        }

        aux=0;

        while(aux==0){

            System.out.println("Introduce tu tarjeta: ");
            this.tarjeta = sc.nextInt();

            if(this.tarjeta>0){

                aux=1;

            }else{

                System.out.println("Introduce una tarjeta valida");

            }

        }

        aux=0;

        while(aux==0){

            System.out.println("Introduce el dia de entrada: ");
            d = sc.nextInt();
            System.out.println("Introduce el mes de entrada: ");
            m = sc.nextInt();
            System.out.println("Introduce el año de entrada (>=2022): ");
            y = sc.nextInt();

            fe.setDay(d);
            fe.setMonth(m);
            fe.setYear(y);

            if(fe.isValido(fe.getDay(),fe.getMonth(),fe.getYear())){

                this.entrada = fe;
                aux=1;

            }else{

                System.out.println("Introduce una fecha de entrada valida");

            }
        }

        aux = 0;

        while(aux==0){

            System.out.println("Introduce el dia de salida: ");
            d = sc.nextInt();
            System.out.println("Introduce el mes de salida: ");
            m = sc.nextInt();
            System.out.println("Introduce el año de salida (>=2022): ");
            y = sc.nextInt();

            fs.setDay(d);
            fs.setMonth(m);
            fs.setYear(y);

            if(fs.isValido(fs.getDay(),fs.getMonth(),fs.getYear())){

                this.salida=fs;
                aux=1;

            }else{

                System.out.println("Introduce una fecha de salida valida");

            }
        }

        aux=0;

        while(aux==0) {
            System.out.println("REGIMEN\n");
            System.out.println("1) Sin desayuno\n");
            System.out.println("2) Con desayuno\n");
            System.out.println("3) Media pension\n");
            System.out.println("4) Pension completa\n");
            System.out.println("Introduce regimen: ");
            this.regimen = sc.nextInt();

            if(this.regimen>0 && this.regimen<5){

                aux=1;
            }else{

                System.out.println("Introduce un numero valido");
            }

        }

    }

}
