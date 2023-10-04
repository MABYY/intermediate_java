package com.codewithmosh;

public class Main {

    public static void main(String[] arg) {
        var control = new UIControl(true);
        control.disable();
        System.out.println(control.isEnabled());

        // We can use the features from UIControl since
        // textbox extendes from it
        var controlTB = new TextBox();
        controlTB.disable();
        System.out.println(controlTB.isEnabled());

        // Check the hash code of the address in memory of the controlTB
        System.out.println(controlTB.hashCode());


        // COMPARE OBJECTS BY HASHCODE
        // This hascode is used when checking
        // if two objects are equal

        var box1 = new TextBox();
        var box2 = box1;
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
        System.out.println(box2.equals(box1));

        // String representation of an object
        System.out.println(box1.toString());

        // CHECK HOW THE @Override decorator changes the
        // methods output

        var textbox20 = new TextBox();
        textbox20.setText("HELLO WORDDD");
        System.out.println(textbox20);
        System.out.println(textbox20.toString());

    }
}

