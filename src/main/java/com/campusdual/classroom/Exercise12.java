package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {

        Car c1=new Car("Ford","Fiesta", "Gasolina" );

        //Un método booleano que verifique si el valor del tacómetro es cero
        if(c1.isTachometerEqualToZero()){
            System.out.println("El tacómetro está a cero");
        }else{
            System.out.println("El tacómetro no está a cero");
        }

        //Encender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto)
        if(c1.isTachometerEqualToZero()){
            c1.start();
        }

        //Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
        if(c1.tachometer==1000){
            c1.start();
        }

        //Apagar el coche comprobando que el valor del tacómetro es correcto
        if(c1.tachometer==1000){
            c1.stop();
        }

        //Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
        if(c1.speedometer!=0){
            c1.stop();
        }

        //Acelerar el coche
        c1.accelerate();

        //Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        c1.accelerate();
        c1.accelerate();

        //Frenar la velocidad
        c1.brake();

        //Frenar hasta un valor negativo (y comprobar que no se puede)
        c1.brake();
        c1.brake();
        c1.brake();

        //Girar el volante 20 grados
        c1.turnAngleOfWheels(20);

        //Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        c1.turnAngleOfWheels(45);

        //Detener el coche y poner marcha atrás
        c1.stop();
        c1.setReverse(true);

        //Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
        c1.start();
        c1.accelerate();
        c1.setReverse(true);

    }

}