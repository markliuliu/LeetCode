package Q223X;

/**
 * Created by Mark on 2017/7/29.
 */
public class RectangleArea {
    public static void main (String args[]) {
        RectangleArea r = new RectangleArea();
        int out = r.computeArea(0,0,0,0,-1,-1,1,1);
        System.out.println(out);

    }

    //TODO: not right now.
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int widthA= C-A, widthB= G-E, heightA= D-B, heightB= H-F;
        int output = widthA*heightA + widthB* heightB;
        int redundentW =0, redundentH=0;
        //(C,B) (E,H)
        if(C>E && H>B) {
            System.out.println("1");
            redundentW = C-E;
            redundentH = H-B;
        }
        //(C,D) (E,F)
        else if(C>E && D>F) {
            System.out.println("2");
            redundentW = C-E;
            redundentH = F-D;
        }
        //(A,B) (G,H)
        else if(G>A && H>B) {
            System.out.println("3");
            redundentW = G-A;
            redundentH = H-B;
        }
        //(A,D) (G,F)
        else if(G>A && D>F) {
            System.out.println("4");
            redundentW = G-A;
            redundentH = D-F;
        }
        output = output-redundentH*redundentW;
        return output;
    }
}
