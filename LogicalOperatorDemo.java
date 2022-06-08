class LogicalOperatorDemo{
 
public static void main (String [] args){


           int p = 50;
           int q = 100;

System.out.println((p>q)&&(p<q--));
System.out.println("q:"+q);
System.out.println((p<q)&&(p<q));
System.out.println("q:"+q);
}
}