package com.codewithmosh;

public class TextBox extends UIControl{
    private String text = "";

//   public TextBox() {
//        System.out.println("TextBox");
//    }

    // Call the constructor to provide the insitall value
    // required by the UIControl constructor

        public TextBox() {
            // this passes the initial value
            // to the UI Control constructor
            super(true);
            System.out.println("TextBox");
        }

        // Override toString()
    @Override
    public String toString(){
            return text;
    }



        public void setText(String text) {
            this.text = text;
        }
        public void clearText(){
            this.text = "";
        }
}
