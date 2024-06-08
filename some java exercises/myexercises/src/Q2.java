

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Q1 {

	public static void printMatrixRbR (int [][]m,int x,int y) {
		int i=0;
	Random rand=new Random ();	
	for(i=0;i<x;i++) {
		IntStream ints =rand.ints(y,-100,10);
		ints.forEach(System.out::print);
		System.out.println("\n");
	}
	}
	
	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("please enter numbers of line");
     int x =scn.nextInt();
     System.out.println("please enter numbers of column");
     int y =scn.nextInt();
      scn.close();
	    int [][]m=new int[x][y];
	    printMatrixRbR(m,x,y);
	}

}


import java.util.Random;
import java.util.Scanner;
public class Q2 {

	public static void printMatrixRbR(int [][]m,int x,int y) {
		Random rand=new Random ();	
		m=new int[x][y];
	
		for(int i=0;i<x;i++) {
			
			for(int j=0;j<y;j++) {
				
				m[i][j]=rand.nextInt(500)+(-100);
			}
		}
		for(int i=0;i<x;i++) {
			
			for(int j=0;j<y;j++) {
				
				System.out.print(m[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("please enter numbers of line");
		     int x =scn.nextInt();
		     System.out.println("please enter numbers of column");
		     int y =scn.nextInt();
		      scn.close();
		      int [][]m=new int[x][y];
			    printMatrixRbR(m,x,y);

	}

}


import java.util.Scanner;
import java.util.Arrays;
public class Q3 {
	
     public static int[] merge(int[] list1, int[] list2,int size1,int size2){
    	int x=size1+size2-2;
    	int j=0;
    	 int []bruh=new int[x];
    	 for(int i=1;i<size1;i++) {
    			 bruh[j]=list1[i];
    		 j++;
    	 }
    	int a=1;
    		 while(a<size2) {
    			 bruh[j]=list2[a];
    			 a++;
    		     j++;
    	 }
    	 
    	 Arrays.sort(bruh); 
          return bruh;
     }
	
     public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
    	 System.out.println("please enter size of list and first sorted list");
		String l1=scn.nextLine();
		int size1= l1.length();
		System.out.println("please enter size of list and second sorted list");
		String l2=scn.nextLine();
		int size2=l2.length();
		scn.close();
		int []list1=new int[size1];
		int []list2=new int[size2];
		String[] str1 = l1.split("");
		String[] str2 = l2.split("");
		for(int i=0;i<size1;i++) {
			list1[i]=Integer.parseInt(str1[i]);	
		}
		for(int i=0;i<size2;i++) {
			list2[i]=Integer.parseInt(str2[i]);	
		}
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
		System.out.println(Arrays.toString(merge(list1,list2,size1,size2)));
		
		
	}

}



import java.util.Scanner;
public class Q4 {
	public static double sumColumn(double[][] m) {
		double sum=0;
		for(int y=0;y<4;y++) {
		   for(int x=0;x<3;x++) {
			sum=sum+m[x][y];
		 }
		   System.out.printf("sum of elements at column %d is:%.3f \n", y,sum);
		   sum =0;
		}
		return 0;
	}
	public static void main(String[] args) {
		int x=0;
		int y=0;
		Scanner scn=new Scanner(System.in);
		double [][] m=new double [3][4];
	for(x=0;x<3;x++) {
		System.out.println("enter a matrix of length 4");
		for(y=0;y<4;y++) {
			m[x][y]=scn.nextDouble();
			}
	 }
	
	System.out.println(sumColumn(m));
	}

}


import java.util.Arrays;
import java.util.Scanner;
public class Q5 {
	public static double sumColumn(double[][] m) {
		double[] employee=new double[3];
		double sum=0;
		for(int x=0;x<3;x++) { 
		   for(int y=0;y<7;y++) {
			sum =sum +m[x][y];
			employee[x]=sum;
		 }
		  // System.out.printf("sum of elements at column %d is:%.3f \n", x,sum);
		   sum =0;
		}
			Arrays.sort(employee);	
			 for(int i=employee.length-1;i>=0;i--) {
		         if(i==0) {
		        	 System.out.print(employee[i]);
		         }
		         else {
				 System.out.print(employee[i]+">");
		         }
			 }
		return 0;
	}
	public static void main(String[] args) {
		int x=0;
		int y=0;
		Scanner scn=new Scanner(System.in);
		double [][] m=new double [3][7];
	for(x=0;x<3;x++) {
		System.out.println("enter daily work hours for employee %d ");
		for(y=0;y<7;y++) {
			m[x][y]=scn.nextDouble();
			}
	 }
	
	System.out.println(sumColumn(m));

	}

}




import java.util.Random;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		int maxindrow=0;
		int maxindcol=0;
		int i=0;
		int j=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("please enter numbers of line");
		     int x =scn.nextInt();
		     System.out.println("please enter numbers of column");
		     int y =scn.nextInt();
		      scn.close();
		      int [][]m=new int[x][y];
			   
		      Random rand=new Random ();	
				m=new int[x][y];
				for(i=0;i<x;i++) {
					
					for(j=0;j<y;j++) {
						
						m[i][j]=rand.nextInt(2)+(0);
					}
				}
				for(i=0;i<x;i++) {
					
					for(j=0;j<y;j++) {
						
						System.out.print(m[i][j]+" ");
					}
					
					System.out.println();
				}
				
				int[]sum=new int [x];
				int[]sumcol=new int[y];
				int max=0;
				for(i=0;i<x;i++) {
					for(j=0;j<y;j++) {
						sum[i]=sum[i]+m[i][j];
					}
				}
				for(i=0;i<x;i++) {
					if(max<sum[i]) {
						max=sum[i];
						maxindrow=i;
					   }
					}
				
				System.out.printf("the largest row index: %d \n",maxindrow);
				for(j=0;j<y;j++) {
					for(i=0;i<x;i++) {
						sumcol[j]=sumcol[j]+m[i][j];
					}
				}
				for(j=0;j<y-1;j++) {
					if(max<sumcol[j]) {
						max=sum[j];
						maxindcol=j;
					   }
					}
				System.out.printf("the largest column index: %d",maxindcol);
	}

}






import java.util.Scanner;
public class Q7 {
	public static boolean isConsecutiveFour(int[][] m,int x,int y) {
		int i=0;
		int j=0;
		int count1=0;
		int count=0;
		for(i=0;i<x;i++) {
			for(j=0;j<y-1;j++) {
				if(m[i][j]==m[i][j+1]) {
					count1++;
	
				}
				else if(count1<3){
					count1=0;
				}
				
			}
			if(count1>=3) {
				break;
			}
			count1=0;
		}
		for(j=0;j<y;j++) {
			for(i=0;i<x-1;i++) {
				if(m[i][j]==m[i+1][j]) {
					count++;
				}
				else if(count<3){
					count=0;
				}
				
			}
			if(count>=3) {
				break;
			}
			count=0;
		}
		if(count1>=3 || count>=3) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		int i=0;
		int j=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("please enter numbers of line");
		     int x =scn.nextInt();
		     System.out.println("please enter numbers of column");
		     int y =scn.nextInt();
		      
		      int [][]m=new int[x][y];
				for(i=0;i<x;i++) {
					System.out.printf("please enter line %d :",i);
					for(j=0;j<y;j++) {
						
						m[i][j]=scn.nextInt();
					}
				}
				for(i=0;i<x;i++) {
					
					for(j=0;j<y;j++) {
						
						System.out.print(m[i][j]+" ");
					}
					
					System.out.println();
				}
                 scn.close();
                 
                 System.out.println(isConsecutiveFour(m,x,y));
	}

}






import java.util.Scanner;
public class Q8 {
	public static double addMatrix(double[][] m, double[][] l, int x ,int y){
		int i=0;
		int j=0;
		double[][] fınal=new double[x][y];
		for(i=0;i<x;i++) {
			for(j=0;j<y;j++) {
				fınal[i][j]=m[i][j]+l[i][j];
			}
		}
		System.out.println("final matrix: \n");
		for(i=0;i<x;i++) {
			
			for(j=0;j<y;j++) {
				
				System.out.print(fınal[i][j]+" ");
			}
			
			System.out.println();
		}
		return 0;
	}
	public static void main(String[] args) {
		int i=0;
		int j=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("please enter numbers of line");
		     int x =scn.nextInt();
		     System.out.println("please enter numbers of column");
		     int y =scn.nextInt();
		      
		      double [][]m=new double[x][y];
		      double [][]l=new double[x][y];
		      
				for(i=0;i<x;i++) {
					System.out.printf("please enter line %d :",i);
					for(j=0;j<y;j++) {
						m[i][j]=scn.nextDouble();
					}
				}
				for(i=0;i<x;i++) {
					System.out.printf("please enter line %d :",i);
					for(j=0;j<y;j++) {
						l[i][j]=scn.nextDouble();
					}
				}
				System.out.println(addMatrix(m,l,x,y));

	}

}








import java.util.Scanner;
public class Q9 {
	
	public static double[][] multiplyMatrix(double[][] list, double[][] list1){
					
     double [][] bruh = new double [3][3];
	 int i= 0;
	 int j= 0;		
		while(i < 3) {
		    while(j<3) {
		    	bruh[i][j] = (double) ((list[i][0]*list1[0][j])+(list[i][1]*list1[1][j])+(list[i][2]*list1[2][j]));
		    	j++;
		    }
		    j=0;
		    i++;
		}
	  return bruh;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r =3;
		int col = 3;
		int r1 =3;
		int col2 = 3;
		double [][]list = new double[col][r];	
		double [][]list1 = new double[col2][r1];
		for(int i = 0; i<col; i++) {
			 System.out.printf("please enter line of first matrix: ");	
				for(int j = 0; j<r; j++) {
		    		list[i][j] = scn.nextDouble();
		    	}
			}
		for(int i = 0; i<col2; i++) {
			 System.out.printf("please enter line of second matrix: ");	
				for(int j = 0; j<r1; j++) {
		    		list1[i][j] = scn.nextDouble();
		    	}
			}
		       scn.close();
		double[][] a = multiplyMatrix(list,list1);
		
		 for(int i = 0; i<3; i++) {
		    	for(int j = 0; j<3; j++) {
		    		System.out.print(a[i][j]+" ");
		    	}
		    	System.out.println();
		    }		
	}
}

