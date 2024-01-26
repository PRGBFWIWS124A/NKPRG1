import javax.swing.*;

public class Battleship
{
    public static int SIZE = 10;
    public static void main(String[] args)
    {

    }

    static int distance(final Coordinate start, final Coordinate end)
    {
        return Math.abs(start.column() - end.column()) + Math.abs(start.row() - end.row());
    }
    static Coordinate getRandomCoordinate()
    {
       return new Coordinate(Utility.getRandomInt(SIZE), Utility.getRandomInt(SIZE));

    }
    static boolean onOneLine(final Coordinate start, final Coordinate end)
    {
        return (start.column() == end.column()) || (start.row() == end.row());
    }
    static void showSeperatorLine()
    {
        System.out.println("   +-+-+-+-+-+-+-+-+-+-+      +-+-+-+-+-+-+-+-+-+-+");
    }
    static int getMaxSurroundingColumn(final Coordinate start, final Coordinate end)
    {
        return Math.min(Math.max(start.column(), end.column()) + 1, SIZE - 1);
    }
    static int getMaxSurroundingRow(final Coordinate start, final Coordinate end)
    {
        return Math.min(Math.max(start.row(), end.row()) + 1, SIZE - 1);
    }
    static int getMinSurroundingColumn( final Coordinate start, final Coordinate end)
    {
        return Math.max(Math.min(start.column(), end.column()) - 1, 1);
    }
    static int getMinSurroundingRow( final Coordinate start, final Coordinate end)
    {
        return Math.max(Math.min(start.row(), end.row()) - 1, 1);
    }
}
