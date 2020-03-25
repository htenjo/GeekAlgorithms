package co.zero.geekalgorithm.toorganize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class CityBlocks {
  private static int[][] getLockerDistanceGrid(int cityLength, int cityWidth, int[] lockerXCoordinates, int[] lockerYCoordinates) {
    int[][] city = new int[cityWidth][cityLength];
    List<Point> lockerPoints = new ArrayList<>();
    int x, y, lowerDistance, currentDistance;

    for(int i=0; i<lockerXCoordinates.length; i++){
      x = lockerXCoordinates[i] - 1;
      y = lockerYCoordinates[i] - 1;
      lockerPoints.add(new Point(x, y));
    }

    for(int i=0; i<city.length; i++){
      for(int j=0; j<city[i].length; j++){
        lowerDistance = Integer.MAX_VALUE;

        for(Point p : lockerPoints){
          currentDistance = p.getDistance(p.getX(), p.getY(), j, i);
          if (currentDistance < lowerDistance){
           lowerDistance = currentDistance;
          }
        }

        city[i][j] = lowerDistance;
      }
    }

    return city;
  }


  static class Point{
    private int x,y;

    public Point(int x, int y){
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }

    public int getDistance(int x1, int y1, int x2, int y2){
      int xDistance = Math.abs(x1 - x2);
      int yDistance = Math.abs(y1 - y2);
      return xDistance + yDistance;
    }
  }

  public static void main(String[] args){
    int length = 5;
    int width = 7;
    int[] xCoordinates = new int[]{2, 4};
    int[] yCoordinates = new int[]{3, 7};
    int[][] city = getLockerDistanceGrid(length, width, xCoordinates, yCoordinates);

    for(int[] i : city){
      System.out.println(Arrays.toString(i));
    }
  }
}
