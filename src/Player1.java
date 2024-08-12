import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class Player1 extends Team implements Print {
        private int age;

        public int getAge() {
            return age;
        }

        public Player1(int height, Positions position, String name, int age) {
            super(height, position, name);
            this.age = age;
        }

        @Override
        public void print() {
            System.out.println("Name " + getName()  + "\nHeight " + getHeight() + "\nPosition " + getPosition() +
                    "\nAge " + getAge() );
        }


}
