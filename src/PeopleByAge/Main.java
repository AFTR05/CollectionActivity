package PeopleByAge;

import javax.swing.*;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //A continuación se implementa el TreeSet
        TreeSet<Person> people = new TreeSet<Person>();
        Integer option=0;
        Integer optionFill=0;
        //Aquí se puede visualizar la creación del menú donde se crea a las personas con sus atributos
        do{
            do{
                String name = JOptionPane.showInputDialog("Digite el nombre");
                String gender = JOptionPane.showInputDialog("Digite el genero");
                Integer age= Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));
                people.add(new Person(name, age, gender)); // se crean las personas
                optionFill= JOptionPane.showOptionDialog(
                        null,"Seleccione si desea seguir llenando personas", "Selector de opciones",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        new Object[] { "Continuar","Salir" },null); // se pregunta si desea continuar con la creacion de mas estudiantes
            }while (optionFill!=1);
            String message ="";
            for (Person x:people){
                message+= "- "+x.getName()+" "+x.getAge()+" "+x.getGender()+"\n"; //se imprimen las personas
            }
            JOptionPane.showMessageDialog(null,message);
            option=JOptionPane.showOptionDialog(
                    null,"Seleccione opcion", "Selector de opciones",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] { "Continuar","Salir" },null); //se pregunta si desea continuar
            people.clear();
        }while (option!=1);
    }
}
