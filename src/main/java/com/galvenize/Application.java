package com.galvenize;

public class Application {

    public static void main(String[] args) {
        System.out.println("hello world");

    }

    boolean isActive(String status) {
        // Implement your solution
        if (status.equals("active")) {
            System.out.println("active");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
        //boolean isActive = true;
    }

    int grade(int input) {
        // Implement your solution
        input = 67;
        if (input < 59) {
            System.out.println("F");
        } else if (input <= 69 && input >= 60) {
            System.out.println("D");
        } else if (input <= 79 && input >= 70) {
            System.out.println("C");
        } else if (input <= 89 && input >= 80) {
            System.out.println("B");
        } else if (input <= 100 && input >= 90) {
            System.out.println("A");
        }

        return input;
    }
}



/* touch will create files in terminal
* ie touch .gitignore
* create repo on github
* git add -A
* git commit -m "type your notes for commit"
* in terminal, use javac to compile a .java file
* run java name,java to run the java file
* git push -u origin main //pushes from local to main branch
*
* Java primitives:
* byte, short, int, long, float, double, char, and boolean.
*
*  git fetch updates updated repo locally from remote repo
*  git merge origin/master - syncs with remote repo
*  git pull is a shortcut command for the same thing.
*  git pull origin/master
*
* */

