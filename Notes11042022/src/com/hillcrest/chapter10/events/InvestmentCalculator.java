package com.hillcrest.chapter10.events;

import com.hillcrest.chapter10.BankAccount;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvestmentCalculator {

    private static final double INTEREST_RATE = 0.15;
    private static final double BEGINNING_BALANCE = 100;

    public static void main(String[] args) {

        var frame = new JFrame();
        var button = new JButton("Add interest");
        var jPanel = new JPanel();

        final BankAccount account = new BankAccount(BEGINNING_BALANCE, "Checking");

        var jLabel = new JLabel(String.format("Balance: $%.2f", account.getBalance()));

        class AddInterestListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                double interest = account.getBalance() * INTEREST_RATE / 100;
                account.deposit(interest);
                jLabel.setText(String.format("Balance: %.2f", account.getBalance()));
                System.out.println("Balance" + account.getBalance());
            }
        }

        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);

        jPanel.add(button);
        jPanel.add(jLabel);

        frame.add(jPanel);

        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

}
