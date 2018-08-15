package Q013;

public class RomanInteger {
    public int romanToInt(String s) {
        char[] cs = s.toCharArray();
        int total =0;
        int num = getNum(cs[0]);
        int nextNum = 0;
        for(int i = 0; i<cs.length; i++)
        {
            if(i<cs.length-1)
            {
                nextNum = getNum(cs[i+1]);
                if(num < nextNum) num = -1*num;
            }
            total+=num;
            num = nextNum;
        }
        return total;
    }

    public int getNum(char c)
    {
        switch(c)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;

        }
        return 0;
    }

}
