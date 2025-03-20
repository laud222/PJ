package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        List<Parabola>parabole=new ArrayList<>();
        Scanner scanner=new Scanner(new File("src/ex1/puncte.txt"));

        while(scanner.hasNextLine()){
            Parabola parabola = new Parabola(scanner.nextFloat(),scanner.nextFloat(),scanner.nextFloat());
            parabole.add(parabola);
        }
        System.out.println("Lista de parabole: ");
        for(Parabola p:parabole){
            System.out.println(p+"cu vf"+p.getVarf());
        }
        if(parabole.size()>1){
            Punct mijloc=Parabola.calcMijloc(parabole.get(0),parabole.get(1));
            System.out.println("\nMijlocul segmentului care uneste este: "+mijloc);

            float lungime=Parabola.lungimeSegm(parabole.get(0),parabole.get(1));
            System.out.println("Lungimea segmentului care uneste: "+lungime);
        }
    }

}
