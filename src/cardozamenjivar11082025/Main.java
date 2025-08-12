/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardozamenjivar11082025;

/**
 *
 * @author UFG
 */
public class Main {


    public static int horasEnUnDia = 24;
    public static int segundosEnUnaHora = 3600;
    public static int segundosEnUnMinuto = 60;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variable local
        int segundosTotales = 91111;
        //Se asgina el valor de dias a la variable local
        int dias  = calcularDias(segundosTotales);
        
        int segundosRestantesDespuesDeExtraerDias = obtenerSegundosRestantesDespuesDeExtraerDias(segundosTotales);
        
        int horas = calculaHoras(segundosRestantesDespuesDeExtraerDias);
        int segundosRestantesDespuesDeExtraerHoras = obtenerSegundosRestantesDespuesDeExtraerHoras(segundosRestantesDespuesDeExtraerDias);
        
        int minutos = calcularMinutos(segundosRestantesDespuesDeExtraerHoras);
        int segundosFinales = obtenerSegundosRestantesDespuesDeExtraerMinutos(segundosRestantesDespuesDeExtraerHoras);
        
        System.out.println("Usted ha solicitado calcular los dias, horas, minutos y segundos a partir de un numero mayor a 86400");
        System.out.println("Usted ha indicado el valor actual de segundos como: "+segundosTotales);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundosFinales);
    }
    
    public static int calcularDias(int segundosTotales){
        return segundosTotales/(Main.horasEnUnDia*Main.segundosEnUnaHora);
    }
    
    //Calcular segundos restantes despues de extraer los dias
    public static int obtenerSegundosRestantesDespuesDeExtraerDias(int segundosTotlaes){
        return segundosTotlaes % (Main.horasEnUnDia*Main.segundosEnUnaHora);
    }
    
    //Calular las horas
    public static int calculaHoras(int segundosRestantes){
        return segundosRestantes/Main.segundosEnUnaHora;
    }
    
    //Modulo para calcular los segundos restantes despues de extraer las horas
    public static int obtenerSegundosRestantesDespuesDeExtraerHoras(int segundosRestantes){
        return segundosRestantes % Main.segundosEnUnaHora;
    }
    
    //Modulo para calcular la cantidad de minutos a partir de los segundos restantes
    public static int calcularMinutos(int segundosRestantes){
        return segundosRestantes/Main.segundosEnUnMinuto;
    }
    
    //Modulo para calcular los segundos restantes de toda la operacion
    public static int obtenerSegundosRestantesDespuesDeExtraerMinutos(int segundoRestantes){
        return segundoRestantes % Main.segundosEnUnMinuto;
    }
    
    
}
