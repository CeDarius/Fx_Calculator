package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.text.DecimalFormat;
import java.util.LinkedList;


public class Controller {

    @FXML
    Button one, two, three, four, five, six, seven, eight, nine, zero;
    @FXML
    Button equal, divide, multiple, minus, plus, delete;
    @FXML
    Label label;

    String str1 = null;
    String strAdd = null;
    String strMinus = null;
    String strMultiple = null;
    String strDivide = null;

    double doubleA;

    LinkedList <String> list = new LinkedList<>();

    @FXML
    public void oneClick(ActionEvent e) {
        list.add("1");
        display();
    }
    @FXML
    public void twoClick(ActionEvent e) {
        list.add("2");
        display();
    }
    @FXML
    public void threeClick(ActionEvent e) {
        list.add("3");
        display();
    }
    @FXML
    public void fourClick(ActionEvent e) {
        list.add("4");
        display();
    }
    @FXML
    public void fiveClick(ActionEvent e) {
        list.add("5");
        display();
    }
    @FXML
    public void sixClick(ActionEvent e) {
        list.add("6");
        display();
    }
    @FXML
    public void sevenClick(ActionEvent e) {
        list.add("7");
        display();
    }
    @FXML
    public void eightClick(ActionEvent e) {
        list.add("8");
        display();
    }
    @FXML
    public void nineClick(ActionEvent e) {
        list.add("9");
        display();
    }
    @FXML
    public void zeroClick(ActionEvent e) {
        list.add("0");
        display();
    }


    public void display() {
        str1 = "";
        for(String s : list){
            str1 += s;
        }
        label.setText(str1);
    }

    @FXML
    public void addition(ActionEvent e) {
        System.out.println(str1);
        strAdd = str1;
        while (!list.isEmpty()) {
            list.removeFirst();
        }
    }

    @FXML
    public void subtraction(ActionEvent e) {
        System.out.println(str1);
        strMinus = str1;
        while (!list.isEmpty()) {
            list.removeFirst();
        }
    }

    @FXML
    public void multiple(ActionEvent e) {
        System.out.println(str1);
        strMultiple = str1;
        while (!list.isEmpty()) {
            list.removeFirst();
        }
    }

    @FXML
    public void divide(ActionEvent e) {
        System.out.println(str1);
        strDivide = str1;
        while (!list.isEmpty()) {
            list.removeFirst();
        }
    }

    @FXML
    public void equals(ActionEvent e) {

        if (strAdd != null) {
            System.out.println("+ " + str1);
            equalsAdd();
        }
        if (strMinus != null) {
            System.out.println("- " + str1);
            equalsMinus();
        }
        if (strMultiple != null) {
            System.out.println("* " + str1);
            equalsMultiple();
        }
        if (strDivide != null){
            System.out.println("/ " + str1);
            equalsDivide();
        }
    }

    @FXML
    public void delete(ActionEvent e) {
        while (!list.isEmpty()) {
            list.removeFirst();
        }
        str1 = null;
        strAdd = null;
        strMinus = null;
        strMultiple = null;
        strDivide = null;
        doubleA = 0.0;
        label.setText("0");
    }

    public void equalsAdd(){
        doubleA = Double.parseDouble(strAdd) + Double.parseDouble(str1);
        decimalFormat(doubleA);
    }

    public void equalsMinus(){
        doubleA = Double.parseDouble(strMinus) - Double.parseDouble(str1);
        decimalFormat(doubleA);
    }

    public void equalsMultiple(){
        doubleA = Double.parseDouble(strMultiple) * Double.parseDouble(str1);
        decimalFormat(doubleA);
    }

    public void equalsDivide(){
        doubleA = Double.parseDouble(strDivide) / Double.parseDouble(str1);
        decimalFormat(doubleA);
    }

    public void decimalFormat(double doubleA) {
        DecimalFormat df = new DecimalFormat("0.##########");
        label.setText(df.format(doubleA));
        System.out.println("= " + df.format(doubleA));

    }



}
