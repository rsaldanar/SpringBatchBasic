package com.example.spring.batch.SpringBatchBasic.batch;

import org.apache.logging.log4j.Logger;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @project: SpringBatchBasic
 * @author: rsaldanar
 * @date: 27/7/23
 * @Correo: rsaldanar@gmail.com
 * @description:
 * @history:
 */
@Component
public class Tarea {

  private static Logger Long = org.apache.logging.log4j.LogManager.getLogger(Tarea.class);

  private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

  int contador = 1;

  // crear un proceso que de la hora cada 5 segundos
//  @Scheduled(fixedRate = 1000) // Se ejecuta cada 5 segundos sin importar si termino el proceso anterior.
  @Scheduled(fixedDelay = 1000) // Se ejecuta después de que termina el proceso anterior.
  public void reportCurrentTime() {
    Long.info("The time is now {}", dateFormat.format(new Date()));
    Long.info("The count {}", contador);
    contador++;
  }



  /***
   * En este método cerramos el sistema
   * sin importar si tenemos procesos corriendo.
   * Mostramos el Banner de inicio del sistema...
   */
////   @Scheduled(fixedRate = 500)
//  @Scheduled(fixedDelay = 500)
//   public void restart() {
//    if (contador == 6) {
//        System.out.print("" +
//                " ,---.               ,--.                      ,-----.            ,--.        ,--.            ,-----.                ,--.\n" +
//                "'   .-' ,---. ,--.--.`--',--,--,  ,---. ,-----.|  |) /_  ,--,--.,-'  '-. ,---.|  ,---. ,-----.|  |) /_  ,--,--. ,---.`--' ,---.\n" +
//                "`.  `-.| .-. ||  .--',--.|      \\| .-. |'-----'|  .-.  \\' ,-.  |'-.  .-'| .--'|  .-.  |'-----'|  .-.  \\' ,-.  |(  .-',--.| .--'\n" +
//                ".-'    | '-' '|  |   |  ||  ||  |' '-' '       |  '--' /\\ '-'  |  |  |  \\ `--.|  | |  |       |  '--' /\\ '-'  |.-'  `)  |\\ `--.\n" +
//                "`-----'|  |-' `--'   `--'`--''--'.`-  /        `------'  `--`--'  `--'   `---'`--' `--'       `------'  `--`--'`----'`--' `---'\n" +
//                "       `--'                      `---'\n  " +
//                "" +
//                "Clouse Procces and Systems");
//      System.exit(0);
//    }
//   }





}
