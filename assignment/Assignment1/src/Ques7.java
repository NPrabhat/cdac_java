/*
7.Write a Java program to demonstrate multiple inner classes(Member,Local and Anonymous
Inner class).
*/

public class Ques7 {
    class MemberInner {
        void display() {
            System.out.println("Member Inner Class");
        }
    }

    interface Displayin {
        void display();
    }

    public static void main(String[] args) {
        Ques7 q = new Ques7();
        MemberInner memberInner = q.new MemberInner();
        memberInner.display();

        class LocalInner {
            void display() {
                System.out.println("Local Inner Class");
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();

        Displayin object = new Displayin() {
            @Override
            public void display() {
                System.out.println("Anonymous Inner Class");
            }
        };
        object.display();
    }
}
