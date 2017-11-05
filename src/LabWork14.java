public class LabWork14 {
    public static void main(String[] arg){
        byte b1,b2;
        short sh1,sh2;
        int i1,i2;
        long l1,l2;

        b1=13; b2=7;
        sh1=201; sh2=302;
        i1=345; i2=5;
        l1=845L; l2=2367L;

//        lab2(b1, b2, sh1, sh2, i1, i2, l1, l2);

        boolean t,f;
        t=true;
        f=false;

//        lab3(t,f);

        int d;
        d=25;
//        lab4(i1, i2);
//        lab5();
//        lab6();
//        lab7();
        lab8();

    }
    static void lab2(byte b11, byte b12, short sh11, short sh12, int i11, int i12, long l11, long l12){

        System.out.println("Laboratory work 1.4.2");
        System.out.println("Type Byte "+b11+"+"+b12+"= " +(b11+b12));
        System.out.println("Type Byte "+b11+"-"+b12+"= "+(b11-b12));
        System.out.println("Type Byte "+b11+"*"+b12+"= "+(b11*b12));
        System.out.println("Type Byte "+b11+"/"+b12+"= "+(b11/b12));
        System.out.println("Type Byte "+b11+"%"+b12+"= "+(b11%b12));
        System.out.println("Type Shot "+sh11+"+"+sh12+"= "+(sh11+sh12));
        System.out.println("Type Shot "+sh11+"-"+sh12+"= "+(sh11-sh12));
        System.out.println("Type Shot "+sh11+"*"+sh12+"= "+(sh11*sh12));
        System.out.println("Type Shot "+sh11+"/"+sh12+"= "+(sh11/sh12));
        System.out.println("Type Shot "+sh11+"%"+sh12+"= "+(sh11%sh12));
        System.out.println("Type Int "+i11+"+"+i12+"= "+(i11+i12));
        System.out.println("Type Int "+i11+"-"+i12+"= "+(i11-i12));
        System.out.println("Type Int "+i11+"*"+i12+"= "+(i11*i12));
        System.out.println("Type Int "+i11+"/"+i12+"= "+(i11/i12));
        System.out.println("Type Int "+i11+"%"+i12+"= "+(i11%i12));
        System.out.println("Type Long "+l11+"+"+l12+"= "+(l11+l12));
        System.out.println("Type Long "+l11+"-"+l12+"= "+(l11-l12));
        System.out.println("Type Long "+l11+"*+"+l12+"= "+(l11*l12));
        System.out.println("Type Long "+l11+"/"+l12+"= "+(l11/l12));
        System.out.println("Type Long "+l11+"%"+l12+"= "+(l11%l12));
    }

    static void lab3(boolean t1, boolean f1){
        System.out.println();
        System.out.println("Laboratory work 1.4.3");
        System.out.println("Type Boolean "+t1+" AND "+f1+"= " +(t1&f1));
        System.out.println("Type Boolean "+t1+" OR "+f1+"= "+(t1|f1));
        System.out.println("Type Boolean "+t1+" NOT OR "+f1+"= "+(t1^f1));
        System.out.println("Type Boolean  NOT "+t1+" = "+(!t1));


    }

    static void lab4(int d1, int d2){

        System.out.println("Laboratory work 1.4.4");
        System.out.println("postfix increment and decrement");
        System.out.println(d1+"+1 = "+d1++);
        System.out.println(d2+"-1 = "+d2--);

        System.out.println("prefix increment and decrement");
        System.out.println(++d1+" d1+1");
        System.out.println(--d2+" d2-1");

    }

    static void lab5(){
        System.out.println("Laboratory work 1.4.5");
        int ibit=7;
        System.out.println(Integer.toBinaryString(ibit));
        System.out.println(ibit);
        int ibit1=~ibit;
        System.out.println(Integer.toBinaryString(ibit1));
        System.out.println(ibit1);

    }

    static void lab6(){
        System.out.println("Laboratory work 1.4.6");
        int ibit=16;
        int ibit1;
        System.out.print(Integer.toBinaryString(ibit));
        System.out.println(" -> "+ibit);
        ibit1=ibit<<2;
        System.out.print(Integer.toBinaryString(ibit1));
        System.out.println(" -> "+ibit1);
        ibit1=ibit>>2;
        System.out.print(Integer.toBinaryString(ibit1));
        System.out.println(" -> "+ibit1);
        ibit1=ibit>>>1;
        System.out.print(Integer.toBinaryString(ibit1));
        System.out.println(" -> "+ibit1);

    }
    static void lab7(){

	    	int i3;
	    	String lin1;
	    	i3=-59;
	    	System.out.println("Laboratory work 1.4.7");
	    	System.out.println(i3);
	    	lin1 = i3<0 ? ("A negative numbe"): ("A positive numbe");
	    	System.out.println(lin1);
    }

    static void lab8(){
        System.out.println("Laboratory work 1.4.8");
        byte numbeByte;
        short numbeShort;
        int numbeInt;
        long numbeLong;
        float numbeFloat;
        double numbeDouble;

        numbeDouble=10203040506070809.987654321;
        System.out.println("numbeDouble " +numbeDouble);
        numbeFloat=(float)numbeDouble;
        System.out.println("numbeFloat"+numbeFloat);
        numbeLong=(long)numbeFloat;
        System.out.println("numbeLong "+numbeLong);
        numbeInt=(int)numbeLong;
        System.out.println("numbeInt "+numbeInt);
        numbeShort=(short)numbeInt;
        System.out.println("numbeShort "+numbeShort);
        numbeByte=(byte)numbeShort;
        System.out.print("numbeByte "+numbeByte);
    }
}
