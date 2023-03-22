package com.BridgeLabz.Generics;

public class GenericsProgram {
    public void FindMaxInt(Integer a, Integer b, Integer c){
        int max = a;
        if((b.compareTo(max))>0)
        {
            max=b;
        }
        if((c.compareTo(max))>0){
            max=c;
        }
        System.out.println("Maximum of "+a+ ","+b+" and "+c+ " is: "+max);
    }

    public void FindMaxFloat(Float a, Float b, Float c){
        float max = a;
        if((b.compareTo(max))>0)
        {
            max=b;
        }
        if((c.compareTo(max))>0){
            max=c;
        }
        System.out.println("Maximum of "+a+ ","+b+" and "+c+ " is: "+max);
    }
    public static void main(String[] args) {
        System.out.println("***** Welcome to Generics *****");
        GenericsProgram genericsProgram = new GenericsProgram();
        Integer a=10,b=5,c=3;
        Float d = 10.5F ,e=5.5F,f=3.3F;
        System.out.println("********  Integer values  ********");
        genericsProgram.FindMaxInt(a,b,c);
        genericsProgram.FindMaxInt(b,a,c);

        genericsProgram.FindMaxInt(c,b,a);

        System.out.println("********  Float values  ********");
        genericsProgram.FindMaxFloat(d,e,f);
        genericsProgram.FindMaxFloat(e,d,f);
        genericsProgram.FindMaxFloat(d,f,d);

        System.out.println("********  Float values  ********");
    }


}
