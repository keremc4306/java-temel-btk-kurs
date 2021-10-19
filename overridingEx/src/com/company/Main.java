package com.company;

public class Main {

    public static void main(String[] args) {
        /*
	    TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        System.out.println(teacherCreditManager.calculateCredit(1500));
         */

        BaseCreditManager[] creditManagers = new BaseCreditManager[]
                {new TeacherCreditManager(), new FarmLoanManager()};

        for (BaseCreditManager creditManager:creditManagers) {
            System.out.println(creditManager.calculateCredit(1500));
        }
    }
}
