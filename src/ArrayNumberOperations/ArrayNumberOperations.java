package ArrayNumberOperations;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayNumberOperations {


    public static void main(String[] args) {
        ArrayList<Double> numbers=new ArrayList<>();
        int option=0;
        Boolean band=true;
        //Aquí se puede observar cómo se realizó el menú para ejecutar varias veces los métodos
        do{
            do{
                band=readValue(Double.parseDouble(JOptionPane.showInputDialog("Digite el numero")),numbers);
            }while (band);
            Double sum=calculateAddition(numbers);
            Double average=calculateAverage(numbers);
            JOptionPane.showMessageDialog(null,showResults(numbers,sum,average));
            numbers.clear();
            option=JOptionPane.showOptionDialog(
                    null,"Seleccione opcion", "Selector de opciones",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] { "Continuar","Salir" },null);
        }while (option!=1);

    }

    //El siguiente método sirve para leer los valores y los almacena en el ArrayList
    public static Boolean readValue(Double number,ArrayList<Double> numbers) {
        if (!(number == (-99))){
            numbers.add(number);
            return true;
        } else {
            return false;
        }
    }
    // El siguiente método sirve para hacer la respectiva suma en el cuál recibe como parametro el ArrayList donde se calcula
    // y devuelve la suma
    public static Double calculateAddition(ArrayList<Double> numbers){
        Double sum = 0.0;
        for (Double x:numbers){
            sum+=x;
        }
        return sum;
    }

    //El siguiente método calcula la media
    public static Double calculateAverage(ArrayList<Double> numbers){
        return calculateAddition(numbers)/numbers.size();
    }

    //El siguiente método muestra los resultados en donde se muestran todos los valores, la suma y media.
    public static String showResults(ArrayList<Double> numbers, double sum, double average){
        String message="";
        message+="La cantidad de valores es: " + numbers.size()+"\n";
        message+="La suma de los valores es: " + sum+"\n";
        message+="La media de los valores es: " + average+"\n";
        Iterator<Double> i=numbers.iterator();
        int countAboveAverage = 0;
        while(i.hasNext()){
            if(i.next()> average){
                countAboveAverage++;
            }
        }
        message+="Estos son los valores mayores a la media: " + countAboveAverage+"\n";
        message+="Los valores leidos son: "+ numbers+"\n";
        return message;
    }
}