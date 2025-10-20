package lab_12_JavaAPI_Sort.MoreExercises;

import java.util.List;
import java.util.ArrayList;

public class SortMountains {
        public static void main(String args[]) {
            new SortMountains().go();
        }

        public void go(){
            List<Mountain> mountains = new ArrayList<>();
            mountains.add(new Mountain("Long",14255));
            mountains.add(new Mountain("Elbert",14433));
            mountains.add(new Mountain("Elbert",14431));
            mountains.add(new Mountain("Maroon",14156));
            mountains.add(new Mountain("Castle",14265));
            System.out.println("as entered: \n " + mountains);

            mountains.sort((m1,m2) -> m1.getName().compareTo(m2.getName()));
            System.out.println("by name: \n " + mountains);


            mountains.sort((m1,m2) -> m1.getHeight() - m2.getHeight());
            System.out.println("by height: \n" + mountains);

        }
    }




    class Mountain{
        public String name;
        public int height;

        Mountain(String name, int height){
            this.name = name;
            this.height = height;
        }

        public String getName(){
            return name;
        }

        public int getHeight(){
            return height;
        }

        @Override
        public String toString(){
            return "Song {name: " + name + ",height: " + height + "}";
        }

}
