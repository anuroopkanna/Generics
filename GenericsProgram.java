package com.BridgeLabz.Generics;

public class GenericsProgram<T extends  Comparable<T>> {
    T x,y,z;
    public GenericsProgram(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T FindMax(){
        return GenericsProgram.FindMax(x,y,z);
    }
    public static <T extends Comparable<T>>T FindMax(T a, T b, T c){
        T max=a;
        if((b.compareTo(max))>0)
        {
            max=b;
        }
        if((c.compareTo(max))>0){
            max=c;
        }
        System.out.println("Maximum of "+a+ ", "+b+" and "+c+ " is: "+max);
        return max;
    }
    public static void main(String[] args) {
        System.out.println("***** Welcome to Generics *****");
        //GenericsProgram genericsProgram = new GenericsProgram();
        Integer a=10,b=5,c=3;
        Float d = 10.5F ,e=5.5F,f=3.3F;
        String g="lohith",h="divya",i="carla";
      /*  System.out.println("****  Integer values  ****");
        genericsProgram.FindMaxInt(a,b,c);
        genericsProgram.FindMaxInt(b,a,c);
        genericsProgram.FindMaxInt(c,b,a);
        System.out.println("-------------------------");
        System.out.println("****  Float values  ****");
        genericsProgram.FindMaxFloat(d,e,f);
        genericsProgram.FindMaxFloat(e,d,f);
        genericsProgram.FindMaxFloat(d,f,d);
        System.out.println("****  Float values ****");
        System.out.println("-----------------------");
        System.out.println("**** String values **** ");
        genericsProgram.FindMaxString(i,h,g);
        genericsProgram.FindMaxString(h,i,g);
        genericsProgram.FindMaxString(g,h,i);*/
        new GenericsProgram<Integer>(a,b,c).FindMax();
        new GenericsProgram<Float>(d,e,f).FindMax();
        new GenericsProgram<String>(g,h,i).FindMax();
    }
}
