
import java.time.LocalDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tss
 */
public class MainStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        Alunno al;
        al = new Alunno("rossi","mario",100);
       

        Alunno a2 = new Alunno("guerrini","luca");
  
        LocalDateTime ddd = a2.getDatanascita();
        long milsec = 4000;
        Thread.sleep(milsec);

        System.out.println(al.getPresentazione());
        System.out.println(a2.getPresentazione());

        if (al.getVoto() > a2.getVoto()) {
            System.out.println("bravo  " + al.getCognome() + " " + al.getNome());
        } else {
            System.out.println("bravo  " + a2.getCognome()+ " " + a2.getNome());
        }

        // TODO code application logic here
    }

}
