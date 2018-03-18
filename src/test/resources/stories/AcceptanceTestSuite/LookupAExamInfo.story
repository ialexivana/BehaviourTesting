Lookup a definition
Meta:
@author Ivana Alexandru

Narrative:
In order to read the university exams
As an FMI student
I want to read the romanian version of the website
After that i want to check the exams page

Scenario: The user access the romanian version of FMI website
Meta:
Given the user is on the FMI language page
When the user clicks on romanian language
Then the user should see the title: 'Facultatea de Matematica si Informatica, Universitatea Bucuresti'
Then the user should click the left menu row where name: 'Examene'
Then the user should click the left menu row where name: 'Prezentare' 
