package com.javaprogramming;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public void getData(){
        System.out.println(this.myNumber);
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now Ringing"+phoneNumber
        );
    }

    @Override
    public void answer() {
if(isRinging){
    System.out.println("Answering the phone");
    isRinging=false;
}
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging=true;
            System.out.println("Ring Ring");
        }else{
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
