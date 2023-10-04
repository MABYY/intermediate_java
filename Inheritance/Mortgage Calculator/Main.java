package com.codewithmosh;

import org.w3c.dom.Text;

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


        // UPCASTING: casting an object to one of ita SUPER types
        var control1 = new UIControl(true);
        show(control1);

        // If we pass a textbox object,
        // this object is automatically casted to UIControl
        var textBox21 = new TextBox();
        show(textBox21);
        // UPCASTING--> it inherits all the memners of the control object
        // EVERY TEXTBOX object is a UI Control Object
        // Everty Textbox is automatically casted to a UI Control
        // Notice that nothing is printed
        // This is because we have overriden the .toString()

        }
        public static void show(UIControl ctrl) {

            // NOT EVERY UIControl object is a textBox object
            // We need to make sure that the ctrl object passed
            // is an instance of a TextBox object,
            // so that we can cast it to a TB object

            if (ctrl instanceof TextBox) {
                var textBoxCast = (TextBox) ctrl;  // -->DOWNCASRTING  to subtype
                textBoxCast.setText("UIControl object casted to Texbox object");
                }

            System.out.println(ctrl);
            
            // In order to be able to access the TextBox methods
            // we need to specifically cast ctrl to TextBox
            // We create a new variable and cast it to a Textbox boject
            // so that we can have access to its methods

//            var textBoxCast = (TextBox) ctrl;  // -->DOWNCASRTING  to subtype
//            textBoxCast.setText("UIControl object casted to Texbox object");
//            System.out.println(ctrl);







    }
}

