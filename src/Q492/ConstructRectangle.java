package Q492;

/**
 * Created by Mark on 2017/8/8.
 */
public class ConstructRectangle {
    public int[] constructRectangle(int area) {
        int width = (int)Math.sqrt(area);
        int length = width;
        int newArea = width*length;
        while(newArea != area)
        {
            if(width*length>area)
            {
                width--;
            }
            else
            {
                length++;
            }
            newArea = width*length;
        }
        int[] output = {length, width};
        return output;
    }
}
