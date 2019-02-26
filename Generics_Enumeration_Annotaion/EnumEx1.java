package Generics_Enumeration_Annotaion;

/**
 * Created by bobsang89@gmail.com on 2019-02-26
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
enum Direction{EAST, SOUTH, WEST, NORTH}
public class EnumEx1 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1=" + d1);
        System.out.println("d2=" + d2);
        System.out.println("d3=" + d3);

        System.out.println("d1==d2 ? " + (d1==d2));
        System.out.println("d1==d3 ? " + (d1==d3));
        System.out.println("d1.equals(d3) ? " + d1.equals(d3));
        //System.out.println("d2 > d3 ? " + (d2 > d3));                     Error.
        System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
        System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));

        switch (d1){
            case EAST:      //Can't write like Direction.EAST
                System.out.println("The direction is EAST.");
                break;
            case SOUTH:
                System.out.println("The direction is SOUTH.");
                break;
            case NORTH:
                System.out.println("The direction is NORTH.");
                break;
            case WEST:
                System.out.println("The direction is WEST.");
                break;
            default:
                System.out.println("Invalid direction.");
                break;
        }

        Direction[] directions = Direction.values();
        for(Direction d : directions)       //for(Direction d : Direction.values())
            System.out.printf("%s=%d\n", d.name(), d.ordinal());
    }
}
