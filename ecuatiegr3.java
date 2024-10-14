public class ecuatie{
	static double a, b, c, d, delta, centru;
	String x1, x2, x3;

public static void main(String[] args) {
	try{a=Double.valueOf(args[0]).doubleValue();}
	catch(Exception e) {return;}
	try{b=Double.valueOf(args[1]).doubleValue();}
	catch(Exception e) {return;}
	try{c=Double.valueOf(args[2]).doubleValue();}
	catch(Exception e) {return;}
	try{d=Double.valueOf(args[3]).doubleValue();}
	catch(Exception e) {return;}
	new ecuatie(a,b,c);
}

public ecuatie(double a, double b, double c, double d){
	delta=18*a*b*c*d - 4*b*b*b*d + b*b*c*c - 4*a*c*c*c - 27*a*a*d*d;
	centru = -b/(3*a);
	double f=0;
	if(delta>=0) {
		d=Math.sqrt(delta)/(3*a);
		x1="" + (float) (centru-d);
		x2="" + (float) (centru+d);
	}else{
		d=Math.sqrt(-delta)/(2*a);
		x1=(float)centru + "-i" + (float)d;
		x2=(float)centru + "+i" + (float)d;
	}
	write(a,b,c);
}
public void write(double a, double b, double c){
	System.out.println("<HTML>");
	System.out.println("<HEAD><TITLE>Exemplu de export HTML</TITLE></HEAD>");
	System.out.println("<BODY BACKGROUND=\"bkg.jpg\" BGPROPERTIES=\"fixed\">");
	System.out.println("<CENTER>");
	System.out.println("<H2> Ecuatia de gradul II</H2>");
	System.out.println("<HR>");
	System.out.println("Ati introdus parmetrii: a="+a+", b="+b+", c= "+c);
	System.out.println("<BR>");
	String b1,c1;
	if(b<0) b1="- " + (-b); else b1="+ " +b;
	if(c<0) c1="- " + (-c); else c1="+ " +c;
	System.out.println("Ecutia este: "+a+"X<SUP>2</SUP>"+b1+"X "+c1+"=0");
	System.out.println("<HR>");
	System.out.println("<TABLE WIDTH=100%");
	System.out.println("<THEAD>");
	System.out.println("<TR ALIGN=center>");
	System.out.println("<TH> </TH>");
	System.out.println("<TH> Grafic </TH>");
	System.out.println("</TR>");
	System.out.println("</THEAD>");
	System.out.println("<TBODY>");
	System.out.println("<TR>");
	System.out.println("<TD>");
	System.out.println("<TABLE BORDER=1");
	System.out.println("CAPTION ALIGN=center><B> Rezolvare</B><CAPTION>");
	System.out.println("<TR>");
	System.out.println("<TD ALIGN=center>DELTA</TD>");
	System.out.println("<TD>"+ (float)delta + "<TD>");
	System.out.println("<TR>");
	System.out.println("<TD ALIGN=center>CENTRU</TD>");
	System.out.println("<TD>"+ (float)centru + "<TD>");
	System.out.println("<TR>");
	System.out.println("<TD ALIGN=center>X<SUB>1</SUB></TD>");
	System.out.println("<TD>"+x1 + "</TD>");
	System.out.println("</TR>");
	System.out.println("<TR>");
	System.out.println("<TD ALIGN=center>X<SUB>2</SUB></TD>");
	System.out.println("<TD>"+x2+"</TD>");
	System.out.println("</TR>");
	System.out.println("</TABLE>");
	System.out.println("</TD>");
	
	
	
	System.out.println("</TR>");
	System.out.println("</TBODY>");
	System.out.println("</TABLE>");
	System.out.println("</BODY>");
	System.out.println("</HTML>");
}
}
