---
layout: page
title: Nikhilalalalala's Project Portfolio Page
---

Project: Eva <br>
Eva is a desktop HR management application. The user interacts with it using a CLI, and it has a GUI created with JavaFX. It is written in Java, and has about 10 kLoC.

Given below are my contributions to the project.

New Features:
- Adding a staff record
  - What it does: Allows user to add the record of a staff with the compulsory fields of Name, Email, Phone, Address.
  - Justification: This feature forms the foundation of our HR application as we need to store records that the user 
    adds.
- Adding an applicant record
  - What it does: Allows user to add the record of a staff with the compulsory fields of Name, Email, Phone, Address
  - Justification: This feature forms the foundation of our HR application as we need to store records that the user
    adds.
  - Highlights: User can delay the input of Interview Date, so they can set an Interview date while adding an applicant
    or add that detail in later with the edit command. 
- Deleting an applicant record
  - What it does: Allows the user to delete a specific record of a staff based on the index provided.
    Justification: This record allows HR managers to remove specific records so that they can keep the database relevant
    without having outdated entries. 
- Setting the application status of the applicant
  - What it does: When adding an applicant, the status of the application is first set to received but in an actual
    scenario, there are many stages to an application, so this command helps user change the status of application
    in their records.
  - Justification: This helps user track the status of various applicants. 
- Clearing the staff and applicant database
  - What it does: Clears all staff or all applicant records depending on the user input. 
  - Justification: When cHR managers wish to clear the old database of records, this command will come in handy to clear 
    all records in one shot instead of deleting single records one by one.

Code contributed:
[RepoSense Link](https://nus-cs2103-ay2021s1.github.io/tp-dashboard/#search=&sort=groupTitle&sortWithin=title&since=2020-08-14&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=false&tabOpen=true&tabType=zoom&zA=Nikhilalalalala&zR=AY2021S1-CS2103T-W13-1%2Ftp%5Bmaster%5D&zACS=305.6120031176929&zS=2020-08-14&zFS=&zU=2020-10-30&zMG=false&zFTF=commit&zFGS=groupByRepos&zFR=false)

Project management:
- Manages release for v1.2.1 (draft)

Enhancements to existing features:
- User Guide
    - Adapt the clear command to staff and applicants
    - Adapt certain section of the codebase to Eva's name

Documentation:
- User Guide
    - Added documentation for commands: adds, adda, dela, setas, clear s- and clear a- commands
    - Also explained each constraints of inputs for all fields(name, email, phone number, address, date, tag) 
    - Added overview on flow of UG to help users understand the arrangement of different sections in ug
- Developer's Guide
    - Write about certain Use Cases 
    
Community:
- Non trivial Code Reviews here: [#51](https://github.com/AY2021S1-CS2103T-W13-1/tp/pull/51) , [#63](https://github.com/AY2021S1-CS2103T-W13-1/tp/pull/63),
[#89](https://github.com/AY2021S1-CS2103T-W13-1/tp/pull/89), [#57](https://github.com/AY2021S1-CS2103T-W13-1/tp/pull/57)

Tools:
