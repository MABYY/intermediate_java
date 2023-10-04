package com.codewithmosh;

public class UIControl {
    private boolean isEnabled = true;

    public boolean isEnabled() {
        return isEnabled;
    }

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UI Control");
    }

    public void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }

}
