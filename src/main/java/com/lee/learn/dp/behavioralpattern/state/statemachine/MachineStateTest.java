package com.lee.learn.dp.behavioralpattern.state.statemachine;

public class MachineStateTest {

    public static void main(String[] args) {
        Machine toyMachine = new Machine(1);
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println("Remain: " + toyMachine.getCount());
                toyMachine.insertCoin();
                toyMachine.turnCrank();
            }
        } catch (RuntimeException e) {
            System.out.println("toy has been sold out...");
        }

    }
}
