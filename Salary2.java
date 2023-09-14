import java.awt.*;
import java.lang.Double;
import java.util.*;
import java.math.*;
import java.lang.*;
import java.util.List;

//The below program is to calculate your net salary and gross salary and calculate
//the amount of taxes you pay to the Government.
class Salary2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> hrafinal = new ArrayList<>();
        List<Double> dafinal = new ArrayList<>();
        List<Double> bonusfinal = new ArrayList<>();
        List<Double> pffinal = new ArrayList<>();
        List<Double> esifinal = new ArrayList<>();
        System.out.println("Please enter your annual salary in numbers : ");
        double salary = scanner.nextDouble();
        double monthly = salary/12;
        if (salary >= 0) {
            System.out.println("Do you live in a rented house?(Answer with either 'YES' or 'NO')");
            String input = scanner.next();
            String input1 = input.toUpperCase();
            if(input1.contains("YES")){
                System.out.println("Enter the rent you pay per month: ");
                double rent  = scanner.nextDouble();
                double rentperyear = rent * 12;

                System.out.println("Enter the HRA you receive per month:");
                double hra = scanner.nextDouble();
                double hraperyear = hra * 12;
                System.out.println("The gross(for 12 months) HRA is : "+hraperyear);
                hrafinal.add(hraperyear);
                System.out.println("Do you live in a metropolitan city:(either 'YES' or 'NO')");
                String hrainput = scanner.next().toUpperCase();
                if(hrainput.contains("YES")){
                    double metro = 0.50 * monthly;
                    double arg1 = rent - (0.10 * monthly);
                    List<Double> hracal = new ArrayList<>();
                    hracal.add(hra);
                    hracal.add(metro);
                    hracal.add(arg1);
                    double Actualhra = Collections.min(hracal) ;
                    System.out.println("The HRA Exception you can detuct is: " + Actualhra);


                } else if (hrainput.contains("NO")) {
                    double metro1 = 0.40 * monthly;
                    double arg2 = rent - (0.10 * monthly);
                    List<Double> hracal2 = new ArrayList<>();
                    hracal2.add(metro1);
                    hracal2.add(hra);
                    hracal2.add(arg2);
                    double Actualhra2 = Collections.min(hracal2) ;
                    System.out.println("The HRA Exception you can detuct is: "+Actualhra2);




                }


            }
            else {
                System.out.println("You can move to Dearness Allowance Calculation");
            }
            System.out.println("Do you receive Dearness Allowance ? ");
            System.out.println("Answer with using 'Yes' or 'No'");
            String dainput = scanner.next().toUpperCase();
            if(dainput.contains("YES")){
                double DA = 0.38 * monthly;
                double DAgross = DA * 12;
                System.out.println("The Dearness Allowance you receive per month is : "+DA);
                System.out.println("The Dearness Allowance you receive in a year is : "+DAgross);
                dafinal.add(DAgross);


            }
            else if (dainput.contains("NO")) {
                System.out.println("You can move to the next part.");
            }


            System.out.println("Do You receive any bonuses in a year('Yes' or 'No') : ");
            String boinput = scanner.next().toUpperCase();
            if(boinput.contains("YES")){
                System.out.println("Enter the Bonus amount: ");
                double bonus = scanner.nextDouble();
                bonusfinal.add(bonus);


            } else if (boinput.contains("NO")) {
                System.out.println("You can move to the deductions part.");


            }


            System.out.println("Enter the PF(Provident Fund Percentage) : ");
            System.out.println("The standard range is 12%");
            double pfpercent= scanner.nextDouble() * 0.01;
            double pfmonth = pfpercent * monthly;
            double pfyear = pfpercent * salary;
            pffinal.add(pfyear);
            System.out.println("The PF(Provident Fund) Detuction for a month is "+pfmonth);
            System.out.println("The PF(Provident Fund) Detuction for a year is "+pfyear);


            System.out.println("Enter The ESI(Employee's state insurance) Percentage : ");
            System.out.println("The standard value is 0.75");
            double esipercent  = scanner.nextDouble() * 0.01;
            double esimonth = esipercent * monthly;
            double esiyear = esipercent *salary;
            esifinal.add(esiyear);
            System.out.println("The ESI deduction for a month is "+esimonth);
            System.out.println("The Gross ESI deduction is "+esiyear);


            System.out.println("We shall move to the Gross Salary Calculations");
            if(input1.contains("YES") && (dainput.contains("YES")) &&(boinput.contains("YES"))){
                double grosssalary = salary + hrafinal.get(0) + dafinal.get(0)+bonusfinal.get(0);
                System.out.println("The Gross Salary is : "+grosssalary);
                double sample = grosssalary - pffinal.get(0) - esifinal.get(0);






                System.out.println("On the basis of your gross salary,provide your income tax percentage: ");
                System.out.println("If Gross Salary is in the range of 0 to 250000,there is no income tax");
                System.out.println("If Gross Salary is in the range of 250000 to 500000,there is 5%");
                System.out.println("If Gross Salary is in the range of 500000 to 750000,there is 10%");
                System.out.println("If Gross Salary is in the range of 750000 to 1000000,there is 15%");
                System.out.println("If Gross Salary is in the range of 1000000 to 1250000,there is 20%");
                System.out.println("If Gross Salary is in the range of 1250000 to 1500000,there is 25%");
                System.out.println("If Gross Salary more than 1500000,there is 30%");
                double incometax = scanner.nextDouble() * 0.01;
                double ITfinal  = sample * incometax;


                double netsalary = sample - ITfinal;
                System.out.println("Your Net Salary is :"+netsalary);
            }
            if(input1.contains("NO") && (dainput.contains("YES")) &&(boinput.contains("YES"))){
                double grosssalary = salary + dafinal.get(0)+bonusfinal.get(0);
                System.out.println("The Gross Salary is : "+grosssalary);
                double sample = grosssalary - pffinal.get(0) - esifinal.get(0);






                System.out.println("On the basis of your gross salary,provide your income tax percentage: ");
                System.out.println("If Gross Salary is in the range of 0 to 250000,there is no income tax");
                System.out.println("If Gross Salary is in the range of 250000 to 500000,there is 5%");
                System.out.println("If Gross Salary is in the range of 500000 to 750000,there is 10%");
                System.out.println("If Gross Salary is in the range of 750000 to 1000000,there is 15%");
                System.out.println("If Gross Salary is in the range of 1000000 to 1250000,there is 20%");
                System.out.println("If Gross Salary is in the range of 1250000 to 1500000,there is 25%");
                System.out.println("If Gross Salary more than 1500000,there is 30%");
                double incometax = scanner.nextDouble() * 0.01;
                double ITfinal  = sample * incometax;


                double netsalary = sample - ITfinal;
                System.out.println("Your Net Salary is :"+netsalary);
            }
            if(input1.contains("YES") && (dainput.contains("YES")) &&(boinput.contains("NO"))) {
                double grosssalary = salary + hrafinal.get(0) + dafinal.get(0);
                System.out.println("The Gross Salary is : " + grosssalary);
                double sample = grosssalary - pffinal.get(0) - esifinal.get(0);


                System.out.println("On the basis of your gross salary,provide your income tax percentage: ");
                System.out.println("If Gross Salary is in the range of 0 to 250000,there is no income tax");
                System.out.println("If Gross Salary is in the range of 250000 to 500000,there is 5%");
                System.out.println("If Gross Salary is in the range of 500000 to 750000,there is 10%");
                System.out.println("If Gross Salary is in the range of 750000 to 1000000,there is 15%");
                System.out.println("If Gross Salary is in the range of 1000000 to 1250000,there is 20%");
                System.out.println("If Gross Salary is in the range of 1250000 to 1500000,there is 25%");
                System.out.println("If Gross Salary more than 1500000,there is 30%");
                double incometax = scanner.nextDouble() * 0.01;
                double ITfinal = sample * incometax;


                double netsalary = sample - ITfinal;
                System.out.println("Your Net Salary is :" + netsalary);

            }
            if(input1.contains("NO") && (dainput.contains("YES")) &&(boinput.contains("NO"))){
                double grosssalary = salary + dafinal.get(0);
                System.out.println("The Gross Salary is : "+grosssalary);
                double sample = grosssalary - pffinal.get(0) - esifinal.get(0);






                System.out.println("On the basis of your gross salary,provide your income tax percentage: ");
                System.out.println("If Gross Salary is in the range of 0 to 250000,there is no income tax");
                System.out.println("If Gross Salary is in the range of 250000 to 500000,there is 5%");
                System.out.println("If Gross Salary is in the range of 500000 to 750000,there is 10%");
                System.out.println("If Gross Salary is in the range of 750000 to 1000000,there is 15%");
                System.out.println("If Gross Salary is in the range of 1000000 to 1250000,there is 20%");
                System.out.println("If Gross Salary is in the range of 1250000 to 1500000,there is 25%");
                System.out.println("If Gross Salary more than 1500000,there is 30%");
                double incometax = scanner.nextDouble() * 0.01;
                double ITfinal  = sample * incometax;


                double netsalary = sample - ITfinal;
                System.out.println("Your Net Salary is :"+netsalary);
            }
            if(input1.contains("YES") && (dainput.contains("NO")) &&(boinput.contains("YES"))){
                double grosssalary = salary + hrafinal.get(0) + bonusfinal.get(0);
                System.out.println("The Gross Salary is : "+grosssalary);
                double sample = grosssalary - pffinal.get(0) - esifinal.get(0);






                System.out.println("On the basis of your gross salary,provide your income tax percentage: ");
                System.out.println("If Gross Salary is in the range of 0 to 250000,there is no income tax");
                System.out.println("If Gross Salary is in the range of 250000 to 500000,there is 5%");
                System.out.println("If Gross Salary is in the range of 500000 to 750000,there is 10%");
                System.out.println("If Gross Salary is in the range of 750000 to 1000000,there is 15%");
                System.out.println("If Gross Salary is in the range of 1000000 to 1250000,there is 20%");
                System.out.println("If Gross Salary is in the range of 1250000 to 1500000,there is 25%");
                System.out.println("If Gross Salary more than 1500000,there is 30%");
                double incometax = scanner.nextDouble() * 0.01;
                double ITfinal  = sample * incometax;


                double netsalary = sample - ITfinal;
                System.out.println("Your Net Salary is :"+netsalary);
            }
            if(input1.contains("NO") && (dainput.contains("NO")) &&(boinput.contains("YES"))){
                double grosssalary = salary +bonusfinal.get(0);
                System.out.println("The Gross Salary is : "+grosssalary);
                double sample = grosssalary - pffinal.get(0) - esifinal.get(0);






                System.out.println("On the basis of your gross salary,provide your income tax percentage: ");
                System.out.println("If Gross Salary is in the range of 0 to 250000,there is no income tax");
                System.out.println("If Gross Salary is in the range of 250000 to 500000,there is 5%");
                System.out.println("If Gross Salary is in the range of 500000 to 750000,there is 10%");
                System.out.println("If Gross Salary is in the range of 750000 to 1000000,there is 15%");
                System.out.println("If Gross Salary is in the range of 1000000 to 1250000,there is 20%");
                System.out.println("If Gross Salary is in the range of 1250000 to 1500000,there is 25%");
                System.out.println("If Gross Salary more than 1500000,there is 30%");
                double incometax = scanner.nextDouble() * 0.01;
                double ITfinal  = sample * incometax;


                double netsalary = sample - ITfinal;
                System.out.println("Your Net Salary is :"+netsalary);
            }
            if(input1.contains("YES") && (dainput.contains("NO")) &&(boinput.contains("NO"))) {
                double grosssalary = salary + hrafinal.get(0) ;
                System.out.println("The Gross Salary is : " + grosssalary);
                double sample = grosssalary - pffinal.get(0) - esifinal.get(0);


                System.out.println("On the basis of your gross salary,provide your income tax percentage: ");
                System.out.println("If Gross Salary is in the range of 0 to 250000,there is no income tax");
                System.out.println("If Gross Salary is in the range of 250000 to 500000,there is 5%");
                System.out.println("If Gross Salary is in the range of 500000 to 750000,there is 10%");
                System.out.println("If Gross Salary is in the range of 750000 to 1000000,there is 15%");
                System.out.println("If Gross Salary is in the range of 1000000 to 1250000,there is 20%");
                System.out.println("If Gross Salary is in the range of 1250000 to 1500000,there is 25%");
                System.out.println("If Gross Salary more than 1500000,there is 30%");
                double incometax = scanner.nextDouble() * 0.01;
                double ITfinal = sample * incometax;


                double netsalary = sample - ITfinal;
                System.out.println("Your Net Salary is :" + netsalary);

            }
            if(input1.contains("NO") && (dainput.contains("NO")) &&(boinput.contains("NO"))){
                double grosssalary = salary ;
                System.out.println("The Gross Salary is : "+grosssalary);
                double sample = grosssalary - pffinal.get(0) - esifinal.get(0);






                System.out.println("On the basis of your gross salary,provide your income tax percentage: ");
                System.out.println("If Gross Salary is in the range of 0 to 250000,there is no income tax");
                System.out.println("If Gross Salary is in the range of 250000 to 500000,there is 5%");
                System.out.println("If Gross Salary is in the range of 500000 to 750000,there is 10%");
                System.out.println("If Gross Salary is in the range of 750000 to 1000000,there is 15%");
                System.out.println("If Gross Salary is in the range of 1000000 to 1250000,there is 20%");
                System.out.println("If Gross Salary is in the range of 1250000 to 1500000,there is 25%");
                System.out.println("If Gross Salary more than 1500000,there is 30%");
                double incometax = scanner.nextDouble() * 0.01;
                double ITfinal  = sample * incometax;


                double netsalary = sample - ITfinal;
                System.out.println("Your Net Salary is :"+netsalary);
            }