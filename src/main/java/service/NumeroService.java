package service;

import java.util.Random;

public class NumeroService {

    public  static int generarCedulaCliente(){
        Random random = new Random();
        int numCliente = random.nextInt(900000000)+ 1000000000;
//        return String.format("%010d", numCliente);
        return numCliente;
    }

    public static int generarCedulaEmpleado(){
        Random random = new Random();
        int numEmpleado = random.nextInt(1000000000)+1000000000;
        return numEmpleado;
    }

    public static String generarNumeroGuia(){
        Random random = new Random();

        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder stringBuilder = new StringBuilder(10);
        for (int i=0; i < 10;i++){
            int index = random.nextInt(letras.length());
            stringBuilder.append(letras.charAt(index));
        }
        return stringBuilder.toString();
    }

    public static String generarIdPaquete(){
        Random random = new Random();
        int idPaquete = random.nextInt(900000000);
        return String.format("%05d", idPaquete);
    }


}
