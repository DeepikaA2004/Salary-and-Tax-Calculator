# Salary and Tax Calculator

## PROBLEM STATEMENT
The objective of this project is to calculate the net salary and gross salary of an individual and determine the amount of taxes they need to pay to the government based on various input parameters such as annual salary, HRA (House Rent Allowance), Dearness Allowance (DA), bonuses, and deductions like Provident Fund (PF) and Employee's State Insurance (ESI). 

## PSEUDOCODE
Start

Initialize scanner for user input
Initialize lists: hrafinal, dafinal, bonusfinal, pffinal, esifinal

Display "Please enter your annual salary in numbers : "
Read salary

Calculate monthly = salary / 12

If salary >= 0 Then
    Display "Do you live in a rented house? (Answer with either 'YES' or 'NO')"
    Read input
    Convert input to uppercase as input1

    If input1 contains "YES" Then
        Display "Enter the rent you pay per month: "
        Read rent
        Calculate rentperyear = rent * 12

        Display "Enter the HRA you receive per month: "
        Read hra
        Calculate hraperyear = hra * 12
        Display "The gross (for 12 months) HRA is: " + hraperyear
        Add hraperyear to hrafinal list

        Display "Do you live in a metropolitan city? (either 'YES' or 'NO')"
        Read hrainput as uppercase

        If hrainput contains "YES" Then
            Calculate metro = 0.50 * monthly
            Calculate arg1 = rent - (0.10 * monthly)
            Create a list hracal containing hra, metro, arg1
            Calculate Actualhra as the minimum value in hracal
            Display "The HRA Exception you can deduct is: " + Actualhra
        Else If hrainput contains "NO" Then
            Calculate metro1 = 0.40 * monthly
            Calculate arg2 = rent - (0.10 * monthly)
            Create a list hracal2 containing metro1, hra, arg2
            Calculate Actualhra2 as the minimum value in hracal2
            Display "The HRA Exception you can deduct is: " + Actualhra2
        End If
    Else
        Display "You can move to Dearness Allowance Calculation"
    End If

    Display "Do you receive Dearness Allowance? (Answer with 'Yes' or 'No')"
    Read dainput as uppercase

    If dainput contains "YES" Then
        Calculate DA = 0.38 * monthly
        Calculate DAgross = DA * 12
        Display "The Dearness Allowance you receive per month is: " + DA
        Display "The Dearness Allowance you receive in a year is: " + DAgross
        Add DAgross to dafinal list
    Else If dainput contains "NO" Then
        Display "You can move to the next part."
    End If

    Display "Do You receive any bonuses in a year?('Yes' or 'No') : "
    Read boinput as uppercase

    If boinput contains "YES" Then
        Display "Enter the Bonus amount: "
        Read bonus
        Add bonus to bonusfinal list
    Else If boinput contains "NO" Then
        Display "You can move to the deductions part."
    End If

    Display "Enter the PF(Provident Fund Percentage) : "
    Display "The standard range is 12%"
    Read pfpercent as a percentage (convert to decimal)
    Calculate pfmonth = pfpercent * monthly
    Calculate pfyear = pfpercent * salary
    Add pfyear to pffinal list
    Display "The PF(Provident Fund) Deduction for a month is " + pfmonth
    Display "The PF(Provident Fund) Deduction for a year is " + pfyear

    Display "Enter The ESI(Employee's state insurance) Percentage : "
    Display "The standard value is 0.75"
    Read esipercent as a percentage (convert to decimal)
    Calculate esimonth = esipercent * monthly
    Calculate esiyear = esipercent * salary
    Add esiyear to esifinal list
    Display "The ESI deduction for a month is " + esimonth
    Display "The Gross ESI deduction is " + esiyear

    Display "We shall move to the Gross Salary Calculations"

    If input1 contains "YES" and dainput contains "YES" and boinput contains "YES" Then
        Calculate grosssalary = salary + hrafinal[0] + dafinal[0] + bonusfinal[0]
        Display "The Gross Salary is : " + grosssalary
        Calculate sample = grosssalary - pffinal[0] - esifinal[0]

        Display "On the basis of your gross salary, provide your income tax percentage:"
        Display "If Gross Salary is in the range of 0 to 250000, there is no income tax"
        Display "If Gross Salary is in the range of 250000 to 500000, there is 5%"
        Display "If Gross Salary is in the range of 500000 to 750000, there is 10%"
        Display "If Gross Salary is in the range of 750000 to 1000000, there is 15%"
        Display "If Gross Salary is in the range of 1000000 to 1250000, there is 20%"
        Display "If Gross Salary is in the range of 1250000 to 1500000, there is 25%"
        Display "If Gross Salary is more than 1500000, there is 30%"
        Read incometax as a percentage (convert to decimal)
        Calculate ITfinal = sample * incometax
        Calculate netsalary = sample - ITfinal
        Display "Your Net Salary is: " + netsalary
    End If

    (Repeat the above "If" block for different combinations of inputs)

End


## SCREENSHOTS

![Output1](https://github.com/DeepikaA2004/Salary-and-Tax-Calculator/assets/110418508/9cc65573-d144-49c9-a83b-cff773536d0d)

![Output2](https://github.com/DeepikaA2004/Salary-and-Tax-Calculator/assets/110418508/8ce322ec-ef1b-4263-9f62-ca1eb7c08238)


## OUTPUT
Please enter your annual salary in numbers : 
300000
Do you live in a rented house?(Answer with either 'YES' or 'NO')
no
You can move to Dearness Allowance Calculation
Do you receive Dearness Allowance ? 
Answer with using 'Yes' or 'No'
yes
The Dearness Allowance you receive per month is : 9500.0
The Dearness Allowance you receive in a year is : 114000.0
Do You receive any bonuses in a year('Yes' or 'No') : 
no
You can move to the deductions part.
Enter the PF(Provident Fund Percentage) : 
The standard range is 12%
12
The PF(Provident Fund) Detuction for a month is 3000.0
The PF(Provident Fund) Detuction for a year is 36000.0
Enter The ESI(Employee's state insurance) Percentage : 
The standard value is 0.75
0.75
The ESI deduction for a month is 187.5
The Gross ESI deduction is 2250.0
We shall move to the Gross Salary Calculations
The Gross Salary is : 414000.0
On the basis of your gross salary,provide your income tax percentage: 
If Gross Salary is in the range of 0 to 250000,there is no income tax
If Gross Salary is in the range of 250000 to 500000,there is 5%
If Gross Salary is in the range of 500000 to 750000,there is 10%
If Gross Salary is in the range of 750000 to 1000000,there is 15%
If Gross Salary is in the range of 1000000 to 1250000,there is 20%
If Gross Salary is in the range of 1250000 to 1500000,there is 25%
If Gross Salary more than 1500000,there is 30%
5
Your Net Salary is :356962.5

Process finished with exit code 0

