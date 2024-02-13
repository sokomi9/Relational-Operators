//Relational operators are used to tell/show a relationship between variables
//E.G if variables are equal
class Relational
{
    
    public static void main(String a[])
    {
//greater than
        float x = 5.6f;
        float y = 6.0f;
        System.out.println(y > x);
//less than
        double w = 4.5;
        double z = 9.2;
        System.out.println(w < z);
//equal to
        int b = 3;
        int c = 4;
        System.out.println(b == c);
//greater or equal
        int d = 5;
        float e = 5.0f;
        System.out.println(d >= e);
//less or equal
        int f = 6;
        int h = 10;
        boolean i = f <= h;
        System.out.println(i);
//not equal
        float n = 5.6f;
        float o = 6.0f;
        boolean p = n != o;
        System.out.println(p);

//comparing operations
int j = 7;
int k = 3;

boolean m = (j + k) > (j - k);
boolean q = (j + k) == (j - k);

System.out.println(m);
System.out.println(q);
   
}
}