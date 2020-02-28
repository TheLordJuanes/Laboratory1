//Juan Esteban CAICEDO A. - A00365977

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.InputMismatchException;

	public class Lab1{

		public static void main(String[] args) throws CloneNotSupportedException{

			Scanner lector = new Scanner(System.in);
			int num;int n;int m;int z=0;int[] unionwithrep;boolean out=false;

			while(!out){

				System.out.println();
				System.out.println("Welcome to the options menu! These are the functions available for this program:");
				System.out.println("1. Strings entry.");
				System.out.println("2. Entry of real numbers greater than zero.");
				System.out.println("3. Entry of whole numbers arrays with length.");
				System.out.println("4. Exit the menu.");
				System.out.println();
				try{
				  System.out.println("Press a number from 1 to 4 respectively to choose one of the above options:");
				  num=lector.nextInt();
				  lector.nextLine();
					switch(num){
					    case 1:
								System.out.println();
								System.out.println("Function chosen -> Strings entry:");
								System.out.println();
								System.out.println("Enter 3 character strings:");
								String chain1=lector.nextLine();
								String chain2=lector.nextLine();
								String chain3=lector.nextLine();
								System.out.println();
								System.out.println("Now, press a number from 1 to 3 to choose one of the next options:");
								System.out.println("1. Strings length.");
								System.out.println("2. Strings concatenation.");
								System.out.println("3. Location of a character in a string position.");
								System.out.println();
								num=lector.nextInt();
							  lector.nextLine();
								switch(num){
									case 1:
										System.out.println();
										System.out.println("Function chosen -> Strings length:");
										System.out.println();
										System.out.println("String length 1: "+chain1.length()+" characters");
						       	System.out.println("String length 2: "+chain2.length()+" characters");
					    		  System.out.println("String length 3: "+chain3.length()+" characters");
					    	    break;
									case 2:
										System.out.println();
										System.out.println("Function chosen -> Strings concatenation:");
										System.out.println();
										System.out.println("So, all the strings you entered are: "+chain1+", "+chain2+" and "+chain3+".");
										break;
									case 3:
										System.out.println();
										System.out.println("Function chosen -> Location of a character in a string position:");
										System.out.println();
										System.out.println("Enter the position number you want to inspect in the strings, greater than or equal to 0:");
										int pos=lector.nextInt();
										System.out.println();
										if (pos>chain1.length() || pos<0){
											System.out.println("Error. The position "+pos+" does not exist in the string: "+chain1+".");
										}
										else{
											System.out.println("So, in the position "+pos+" of the first string, you can find the character: ");
											System.out.println(chain1.charAt(pos));
										}
										if (pos>chain2.length() || pos<0){
											System.out.println("Error. The position "+pos+" does not exist in the string: "+chain2+".");
										}
										else{
											System.out.println("So, in the position "+pos+" of the second string, you can find the character: ");
											System.out.println(chain2.charAt(pos));
										}
										if (pos>chain3.length() || pos<0){
											System.out.println("Error. The position "+pos+" does not exist in the string: "+chain3+".");
										}
										else{
											System.out.println("So, in the position "+pos+" of the third string, you can find the character: ");
											System.out.println(chain3.charAt(pos));
										}
										break;
									default:
						      	System.out.println("Error! Not available option...");
										break;
									}
				        break;
							case 2:
								System.out.println();
								System.out.println("Function chosen -> Entry of real numbers greater than zero:");
								System.out.println();
		          	System.out.println("Enter two real numbers greater than 0:");
		          	double real1=lector.nextDouble();
				    		double real2=lector.nextDouble();
								System.out.println();
								System.out.println("Now, press 1 or 2 respectively to choose one of the next options:");
								System.out.println("1. Division of the real numbers.");
								System.out.println("2. Division and residual of the whole part of real numbers.");
								System.out.println();
								num=lector.nextInt();
							  lector.nextLine();
								switch(num){
									case 1:
										System.out.println();
										System.out.println("Function chosen -> Division of the real numbers:");
										System.out.println();
										double quotient=real1/real2;
									 	System.out.println("The quotient of the numbers entered is: "+quotient+".");
										break;
									case 2:
										System.out.println();
										System.out.println("Function chosen -> Division and residual of the whole part of the real numbers:");
										System.out.println();
										int whole1 = (int)real1;
							    	int whole2 = (int)real2;
										int quotientwh=quotientWhole(whole1,whole2);
							    	int residual=residualWhole(whole1,whole2);
								   	System.out.println("The quotient of the whole part of the real numbers entered is "+quotientwh+" and the residual is "+residual+".");
								  	break;
									default:
						      	System.out.println("Error! Not available option...");
										break;
									}
					    	break;
							case 3:
								System.out.println();
								System.out.println("Function chosen -> Entry of three whole numbers arrays with length specified:");
								System.out.println();
							 	System.out.println("What length do you want for your first array?");
							  int length1=lector.nextInt();
								System.out.println();
					      int[] array1=new int[length1];
						 		System.out.println("Fill it down:");
						   	for (int i=0; i<length1; i++){
									System.out.println((i+1)+". Enter a whole number:");
					    		array1[i]=lector.nextInt();
								}
								System.out.println();
								System.out.println("What length do you want for your second array?");
								int length2=lector.nextInt();
								System.out.println();
								int[] array2=new int[length2];
								System.out.println("Fill it down:");
							 	for (int j=0; j<length2; j++){
									System.out.println((j+1)+". Enter a whole number:");
									array2[j]=lector.nextInt();
								}
								System.out.println();
								System.out.println("What length do you want for your third array?");
								int length3=lector.nextInt();
								System.out.println();
							 	int[] array3=new int[length3];
								System.out.println("Fill it down:");
								for (int k=0; k<length3; k++){
									System.out.println((k+1)+". Enter a whole number:");
									array3[k]=lector.nextInt();
								}
								System.out.println();
								System.out.println("Now, press a number from 1 to 9 to choose one of the next options:");
								System.out.println("1. Deployment of entered arrangements.");
								System.out.println("2. Average value of values entered in an array.");
								System.out.println("3. Higher value of the values entered in an array.");
								System.out.println("4. Array with addition, subtraction or multiplication operation.");
								System.out.println("5. Array with union of arrays entered in option 5 with repeated elements.");
								System.out.println("6. Array with union of arrays entered in option 5 without repeated elements.");
								System.out.println("7. Array with intersection of arrays entered in option 5 with repeated elements.");
								System.out.println("8. Turn of n positions of the values of an array of option 5.");
								System.out.println("9. Order from least to greatest of the values of an arrangement of option 5.");
								System.out.println();
								num=lector.nextInt();
							  lector.nextLine();
								switch(num){
									case 1:
										System.out.println();
										System.out.println("Function chosen -> Deployment of entered arrays:");
										System.out.println();
										System.out.print("So, the whole numbers of your first array are: ");
										System.out.println(Arrays.toString(array1));
										System.out.print("So, the whole numbers of your second array are: ");
										System.out.println(Arrays.toString(array2));
										System.out.print("So, the whole numbers of your third array are: ");
										System.out.println(Arrays.toString(array3));
										break;
									case 2:
										System.out.println();
										System.out.println("Function chosen -> Average of the values entered in an array:");
										System.out.println();
										System.out.println("Which of the three arrays entered before do you want to use? Press 1 to choose the first one, 2 for the second one, or 3 for the third one:");
										n=lector.nextInt();
										System.out.println();
										if (n==1){
											double average1=calculateAverage1(array1,length1);
											System.out.print("If the first array is: ");
											System.out.println(Arrays.toString(array1));
											System.out.println("The average of the values in this array is: "+average1);
										}
										else if (n==2){
											double average2=calculateAverage2(array2,length2);
											System.out.print("If the second array is: ");
											System.out.println(Arrays.toString(array2));
											System.out.println("The average of the values in this array is: "+average2);
										}
										else if  (n==3){
											double average3=calculateAverage3(array3,length3);
											System.out.print("If the third array is: ");
											System.out.println(Arrays.toString(array3));
											System.out.println("The average of the values in this array is: "+average3);
										}
										else if (n!=1 && n!=2 && n!=3){
											System.out.println("Error. You have to enter a number from 1 to 3 to choose one of the three arrays entered before. Restart the program...");
										}
										break;
									case 3:
										System.out.println();
										System.out.println("Function chosen -> Higher value of the values entered in an array:");
										System.out.println();
										System.out.println("Which of the three arrays entered before do you want to use? Press 1 to choose the first one, 2 for the second one, or 3 for the third one:");
										n=lector.nextInt();
										System.out.println();
										int posi=0;
										if (n==1){
											int higher1=calculateHigher1(array1,posi);
											System.out.print("If the first array is: ");
											System.out.println(Arrays.toString(array1));
											System.out.println("The higher value of this array is "+higher1+".");
										}
										else if (n==2){
											int higher2=calculateHigher2(array2,posi);
											System.out.print("If the second array is: ");
											System.out.println(Arrays.toString(array2));
											System.out.println("The higher value of this array is "+higher2+".");
										}
										else if  (n==3){
											int higher3=calculateHigher3(array3,posi);
											System.out.print("If the third array is: ");
											System.out.println(Arrays.toString(array3));
											System.out.println("The higher value of this array is "+higher3+".");
										}
										else if (n!=1 && n!=2 && n!=3){
											System.out.println("Error. You have to enter a number from 1 to 3 to choose one of the three arrays entered before. Restart the program...");
										}
										break;
									case 4:
										System.out.println();
										System.out.println("Function chosen -> Addition, subtraction or multiplication of arrays:");
										System.out.println();
											System.out.println("Choose two of the three arrays entered before. Press 1 to choose the first one, 2 to choose the second one, or 3 to choose the third one:");
											System.out.println();
											System.out.print("Number of the array chosen: ");
											n=lector.nextInt();
											if (n!=1 && n!=2 && n!=3){
												System.out.println("Error. You have to enter a number from 1 to 3 to choose one of the three arrays entered before. Restart the program...");
											}
											System.out.println();
											System.out.print("Number of the array chosen: ");
											m=lector.nextInt();
											if (m!=1 && m!=2 && m!=3){
												System.out.println("Error. You have to enter a number from 1 to 3 to choose one of the three arrays entered before. Restart the program...");
											}
											System.out.println();
											if (n==1 && m==2){
												System.out.println("What operation do you want to do with the arrays you chose? Press 1 for addition, 2 for subtraction or 3 for multiplication:");
												int op=lector.nextInt();
												if (op==1){
													int v1=array1.length;
													int v2=array2.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array1));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array2));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array1.length > i3){
       												valv1 = array1[i3];
      											}
      											int valv2 = 0;
            								if (array2.length > i3){
             									valv2 = array2[i3];
            								}
														vec3[i3]=valv1+valv2;
      										}
													System.out.println();
													System.out.print("So, the sum of these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op==2){
													int v1=array1.length;
													int v2=array2.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array1));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array2));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array1.length > i3){
       												valv1 = array1[i3];
      											}
      											int valv2 = 0;
            								if (array2.length > i3){
             									valv2 = array2[i3];
            								}
														vec3[i3]=valv1-valv2;
      										}
													System.out.println();
													System.out.print("So, the difference between these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op==3){
													int v1=array1.length;
													int v2=array2.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array1));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array2));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array1.length > i3){
       												valv1 = array1[i3];
      											}
      											int valv2 = 0;
            								if (array2.length > i3){
             									valv2 = array2[i3];
            								}
														vec3[i3]=valv1*valv2;
      										}
													System.out.println();
													System.out.print("So, the multiplication of these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op!=1 && op!=2 && op!=3){
													System.out.println("Error. You have to enter a number from 1 to 3 to choose one operation. Restart the program...");
												}
											}
											if (n==1 && m==3){
												System.out.println("What operation do you want to do with the arrays you chose? Press 1 for addition, 2 for subtraction or 3 for multiplication:");
												int op=lector.nextInt();
												if (op==1){
													int v1=array1.length;
													int v2=array3.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array1));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array3));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array1.length > i3){
       												valv1 = array1[i3];
      											}
      											int valv2 = 0;
            								if (array3.length > i3){
             									valv2 = array3[i3];
            								}
														vec3[i3]=valv1+valv2;
      										}
													System.out.println();
													System.out.print("So, the sum of these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op==2){
													int v1=array1.length;
													int v2=array3.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array1));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array3));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array1.length > i3){
       												valv1 = array1[i3];
      											}
      											int valv2 = 0;
            								if (array3.length > i3){
             									valv2 = array3[i3];
            								}
														vec3[i3]=valv1-valv2;
      										}
													System.out.println();
													System.out.print("So, the difference between these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op==3){
													int v1=array1.length;
													int v2=array3.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array1));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array3));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array1.length > i3){
       												valv1 = array1[i3];
      											}
      											int valv2 = 0;
            								if (array3.length > i3){
             									valv2 = array3[i3];
            								}
														vec3[i3]=valv1*valv2;
      										}
													System.out.println();
													System.out.print("So, the multiplication of these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op!=1 && op!=2 && op!=3){
													System.out.println("Error. You have to enter a number from 1 to 3 to choose one operation. Restart the program...");
												}
											}
											if (n==2 && m==1){
												System.out.println("What operation do you want to do with the arrays you chose? Press 1 for addition, 2 for subtraction or 3 for multiplication:");
												int op=lector.nextInt();
												if (op==1){
													int v1=array2.length;
													int v2=array1.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array2));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array1));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array2.length > i3){
       												valv1 = array2[i3];
      											}
      											int valv2 = 0;
            								if (array1.length > i3){
             									valv2 = array1[i3];
            								}
														vec3[i3]=valv1+valv2;
      										}
													System.out.println();
													System.out.print("So, the sum of these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op==2){
													int v1=array2.length;
													int v2=array1.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array2));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array1));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array2.length > i3){
       												valv1 = array2[i3];
      											}
      											int valv2 = 0;
            								if (array1.length > i3){
             									valv2 = array1[i3];
            								}
														vec3[i3]=valv1-valv2;
      										}
													System.out.println();
													System.out.print("So, the difference between these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op==3){
													int v1=array2.length;
													int v2=array1.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array2));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array1));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array2.length > i3){
       												valv1 = array2[i3];
      											}
      											int valv2 = 0;
            								if (array1.length > i3){
             									valv2 = array1[i3];
            								}
														vec3[i3]=valv1*valv2;
      										}
													System.out.println();
													System.out.print("So, the multiplication of these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op!=1 && op!=2 && op!=3){
													System.out.println("Error. You have to enter a number from 1 to 3 to choose one operation. Restart the program...");
												}
											}
											if (n==2 && m==3){
												System.out.println("What operation do you want to do with the arrays you chose? Press 1 for addition, 2 for subtraction or 3 for multiplication:");
												int op=lector.nextInt();
												if (op==1){
													int v1=array2.length;
													int v2=array3.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array2));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array3));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array2.length > i3){
       												valv1 = array2[i3];
      											}
      											int valv2 = 0;
            								if (array3.length > i3){
             									valv2 = array3[i3];
            								}
														vec3[i3]=valv1+valv2;
      										}
													System.out.println();
													System.out.print("So, the sum of these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op==2){
													int v1=array2.length;
													int v2=array3.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array2));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array3));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array2.length > i3){
       												valv1 = array2[i3];
      											}
      											int valv2 = 0;
            								if (array3.length > i3){
             									valv2 = array3[i3];
            								}
														vec3[i3]=valv1-valv2;
      										}
													System.out.println();
													System.out.print("So, the difference between these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op==3){
													int v1=array2.length;
													int v2=array3.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array2));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array3));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array2.length > i3){
       												valv1 = array2[i3];
      											}
      											int valv2 = 0;
            								if (array3.length > i3){
             									valv2 = array3[i3];
            								}
														vec3[i3]=valv1*valv2;
      										}
													System.out.println();
													System.out.print("So, the multiplication of these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op!=1 && op!=2 && op!=3){
													System.out.println("Error. You have to enter a number from 1 to 3 to choose one operation. Restart the program...");
												}
											}
											if (n==3 && m==1){
												System.out.println("What operation do you want to do with the arrays you chose? Press 1 for addition, 2 for subtraction or 3 for multiplication:");
												int op=lector.nextInt();
												if (op==1){
													int v1=array3.length;
													int v2=array1.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array3));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array1));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array3.length > i3){
       												valv1 = array3[i3];
      											}
      											int valv2 = 0;
            								if (array1.length > i3){
             									valv2 = array1[i3];
            								}
														vec3[i3]=valv1+valv2;
      										}
													System.out.println();
													System.out.print("So, the sum of these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op==2){
													int v1=array3.length;
													int v2=array1.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array3));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array1));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array3.length > i3){
       												valv1 = array3[i3];
      											}
      											int valv2 = 0;
            								if (array1.length > i3){
             									valv2 = array1[i3];
            								}
														vec3[i3]=valv1-valv2;
      										}
													System.out.println();
													System.out.print("So, the difference between these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op==3){
													int v1=array3.length;
													int v2=array1.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array3));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array1));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array3.length > i3){
       												valv1 = array3[i3];
      											}
      											int valv2 = 0;
            								if (array1.length > i3){
             									valv2 = array1[i3];
            								}
														vec3[i3]=valv1*valv2;
      										}
													System.out.println();
													System.out.print("So, the multiplication of these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op!=1 && op!=2 && op!=3){
													System.out.println("Error. You have to enter a number from 1 to 3 to choose one operation. Restart the program...");
												}
											}
											if (n==3 && m==2){
												System.out.println("What operation do you want to do with the arrays you chose? Press 1 for addition, 2 for subtraction or 3 for multiplication:");
												int op=lector.nextInt();
												if (op==1){
													int v1=array3.length;
													int v2=array2.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array3));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array2));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array3.length > i3){
       												valv1 = array3[i3];
      											}
      											int valv2 = 0;
            								if (array2.length > i3){
             									valv2 = array2[i3];
            								}
														vec3[i3]=valv1+valv2;
      										}
													System.out.println();
													System.out.print("So, the sum of these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op==2){
													int v1=array3.length;
													int v2=array2.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array3));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array2));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array3.length > i3){
       												valv1 = array3[i3];
      											}
      											int valv2 = 0;
            								if (array2.length > i3){
             									valv2 = array2[i3];
            								}
														vec3[i3]=valv1-valv2;
      										}
													System.out.println();
													System.out.print("So, the difference between these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op==3){
													int v1=array3.length;
													int v2=array2.length;
													int v3=0;
													System.out.print("If the first array chosen is: ");
													System.out.println(Arrays.toString(array3));
													System.out.print("And, the second array chosen is: ");
													System.out.println(Arrays.toString(array2));
													v3=v1;
     											if (v2 > v1){
														v3=v2;
													}
													int[] vec3 = new int[v3];
													for(int i3=0; i3<vec3.length; i3++){
      											int valv1 = 0;
      											if (array3.length > i3){
       												valv1 = array3[i3];
      											}
      											int valv2 = 0;
            								if (array2.length > i3){
             									valv2 = array2[i3];
            								}
														vec3[i3]=valv1*valv2;
      										}
													System.out.println();
													System.out.print("So, the multiplication of these two arrays is: ");
													System.out.print(Arrays.toString(vec3));
													System.out.println();
												}
												else if (op!=1 && op!=2 && op!=3){
													System.out.println("Error. You have to enter a number from 1 to 3 to choose one operation. Restart the program...");
												}
											}
											else if (n==1 && m==1){
												System.out.println("Error. You chose the first array 2 times. You have to choose different arrays. Restart the program...");
											}
											else if (n==2 && m==2){
												System.out.println("Error. You chose the second array 2 times. You have to choose different arrays. Restart the program...");
											}
											else if (n==3 && m==3){
												System.out.println("Error. You chose the third array 2 times. You have to choose different arrays. Restart the program...");
											}
										break;
									case 5:
										System.out.println();
										System.out.println("Function chosen -> Array with union of the arrays entered with repeated elements:");
										System.out.println();
										unionwithrep=new int[array1.length+array2.length+array3.length];
										z=0;
										unionwithrep=arraywithrep(array1,array2,array3);
										System.out.print("Resulting joined array: ");
										System.out.println(Arrays.toString(unionwithrep));
										break;
									case 6:
										System.out.println();
						     		System.out.println("Function chosen -> Array with union of the arrays entered without repeated elements:");
										System.out.println();
										System.out.println("Array 1 : "+Arrays.toString(array1));
										System.out.println("Array 2 : "+Arrays.toString(array2));
										System.out.println("Array 3 : "+Arrays.toString(array3));
										System.out.println();
										int[] unionwithoutrep1 = IntStream
										.concat(IntStream.of(array1), IntStream.of(array2))
        						.distinct()
        						.sorted()
        						.toArray();
										int[] unionwithoutrep2 = IntStream
										.concat(IntStream.of(unionwithoutrep1), IntStream.of(array3))
        						.distinct()
        						.sorted()
        						.toArray();
    								System.out.print("Resulting joined array without repeated elements: "+Arrays.toString(unionwithoutrep2));
										System.out.println();
										break;
									case 7:
					      		System.out.println("Function chosen -> Array with intersection of the three arrays entered:");
										System.out.println("The new array of the intersection of the three arrays entered before is:");
      							for(int i = 0; i<array1.length; i++ ) {
         							for(int j = 0; j<array2.length; j++) {
												for (int k = 0; k<array3.length; k++){
													if(array2[j]==array3[k] && array2[j]==array1[i]){
														System.out.println(array3[k]);
													}
												}
											}
      							}
										break;
									case 8:
						       	System.out.println("Function chosen -> Turn of n positions of the values of an array:");
										System.out.println();
										System.out.println("Which of the three arrays entered before do you want to use? Press 1 to choose the first one, 2 for the second one, or 3 for the third one:");
										n=lector.nextInt();
										int np=0;
										int dir;
										System.out.println();
										if (n==1){
											System.out.print("In which direction do you want to rotate the array? Press 1 to choose Left or press 2 to choose Right: ");
											dir=lector.nextInt();
											if(dir==1){
												System.out.println();
												System.out.print("Now, enter the number of positions to rotate:");
												np=lector.nextInt();
												System.out.println();
												System.out.print("Array before rotation: ");
												System.out.println(Arrays.toString(array1));
												int temp;
												for (int i = 0; i < np; i++){
        									temp = array1[0];
        									for (int j = 0; j < array1.length-1; j++){
                						array1[j] = array1[j+1];
        									}
        									array1[array1.length-1]=temp;
												}
												System.out.print("Array after left rotation by "+np+" positions: ");
												System.out.print(Arrays.toString(array1));
												System.out.println();
											}
											else if (dir==2){
												System.out.println();
												System.out.print("Now, enter the number of positions to rotate:");
												np=lector.nextInt();
												System.out.println();
												System.out.print("Array before rotation: ");
												System.out.println(Arrays.toString(array1));
												int temp;
												for (int i = 1; i <= np; i++){
													temp = array1[array1.length-1];
													for (int j = array1.length-1; j > 0; j--){
														array1[j] = array1[j-1];
													}
													array1[0]=temp;
												}
												System.out.print("Array after right rotation by "+np+" positions: ");
												System.out.print(Arrays.toString(array1));
												System.out.println();
											}
											else if (dir!=1 && dir!=2){
												System.out.println("Error. You have to enter a number from 1 to 2 to choose the direction of rotation. Restart the program...");
											}
										}
										else if (n==2){
											System.out.print("In which direction do you want to rotate the array? Press 1 to choose Left or press 2 to choose Right: ");
											dir=lector.nextInt();
											if(dir==1){
												System.out.println();
												System.out.print("Now, enter the number of positions to rotate:");
												np=lector.nextInt();
												System.out.println();
												System.out.print("Array before rotation: ");
												System.out.println(Arrays.toString(array2));
												int temp;
												for (int i = 0; i < np; i++){
        									temp = array2[0];
        									for (int j = 0; j < array2.length-1; j++){
                						array2[j] = array2[j+1];
        									}
        									array2[array2.length-1]=temp;
												}
												System.out.print("Array after left rotation by "+np+" positions: ");
												System.out.print(Arrays.toString(array2));
												System.out.println();
											}
											else if (dir==2){
												System.out.println();
												System.out.print("Now, enter the number of positions to rotate:");
												np=lector.nextInt();
												System.out.println();
												System.out.print("Array before rotation: ");
												System.out.println(Arrays.toString(array2));
												int temp;
												for (int i = 1; i <= np; i++){
													temp = array2[array2.length-1];
													for (int j = array2.length-1; j > 0; j--){
														array2[j] = array2[j-1];
													}
													array2[0]=temp;
												}
												System.out.print("Array after right rotation by "+np+" positions: ");
												System.out.print(Arrays.toString(array2));
												System.out.println();
											}
											else if (dir!=1 && dir!=2){
												System.out.println("Error. You have to enter a number from 1 to 2 to choose the direction of rotation. Restart the program...");
											}
										}
										else if  (n==3){
											System.out.print("In which direction do you want to rotate the array? Press 1 to choose Left or press 2 to choose Right: ");
											dir=lector.nextInt();
											if(dir==1){
												System.out.println();
												System.out.print("Now, enter the number of positions to rotate:");
												np=lector.nextInt();
												System.out.println();
												System.out.print("Array before rotation: ");
												System.out.println(Arrays.toString(array3));
												int temp;
												for (int i = 0; i < np; i++){
        									temp = array3[0];
        									for (int j = 0; j < array3.length-1; j++){
                						array3[j] = array3[j+1];
        									}
        									array3[array3.length-1]=temp;
												}
												System.out.print("Array after left rotation by "+np+" positions: ");
												System.out.print(Arrays.toString(array3));
												System.out.println();
											}
											else if (dir==2){
												System.out.println();
												System.out.print("Now, enter the number of positions to rotate:");
												np=lector.nextInt();
												System.out.println();
												System.out.print("Array before rotation: ");
												System.out.println(Arrays.toString(array3));
												int temp;
												for (int i = 1; i <= np; i++){
													temp = array3[array3.length-1];
													for (int j = array3.length-1; j > 0; j--){
														array3[j] = array3[j-1];
													}
													array3[0]=temp;
												}
												System.out.print("Array after right rotation by "+np+" positions: ");
												System.out.print(Arrays.toString(array3));
												System.out.println();
											}
											else if (dir!=1 && dir!=2){
												System.out.println("Error. You have to enter a number from 1 to 2 to choose the direction of rotation. Restart the program...");
											}
										}
										else if (n!=1 && n!=2 && n!=3){
											System.out.println("Error. You have to enter a number from 1 to 3 to choose one of the three arrays entered before. Restart the program...");
										}
										break;
									case 9:
						       	System.out.println("Function chosen -> Order from least to greatest of the values of an array:");
										System.out.println();
										System.out.println("Which of the three arrays entered before do you want to use? Press 1 to choose the first one, 2 for the second one, or 3 for the third one:");
										n=lector.nextInt();
										int assistant;
										System.out.println();
										if (n==1){
											System.out.print("Array before ordering: ");
											System.out.println(Arrays.toString(array1));
											for (int i=0;i<(array1.length-1);i++){
												for (int q=0;q<(array1.length-1);q++){
													if (array1[q]>array1[q+1]){
														assistant=array1[q];
														array1[q]=array1[q+1];
														array1[q+1]=assistant;
													}
												}
											}
											System.out.print("Array after increasing order: ");
												System.out.println(Arrays.toString(array1));
										}
										else if (n==2){
											System.out.print("Array before ordering: ");
											System.out.println(Arrays.toString(array2));
											for (int j=0;j<(array2.length-1);j++){
												for (int q=0;q<(array2.length-1);q++){
													if (array2[q]>array2[q+1]){
														assistant=array2[q];
														array2[q]=array2[q+1];
														array2[q+1]=assistant;
													}
												}
											}
											System.out.print("Array after increasing order: ");
												System.out.println(Arrays.toString(array2));
										}
										else if  (n==3){
											System.out.print("Array before ordering: ");
											System.out.println(Arrays.toString(array3));
											for (int k=0;k<(array3.length-1);k++){
												for (int q=0;q<(array3.length-1);q++){
													if (array3[q]>array3[q+1]){
														assistant=array3[q];
														array3[q]=array3[q+1];
														array3[q+1]=assistant;
													}
												}
											}
											System.out.print("Array after increasing order: ");
												System.out.println(Arrays.toString(array3));
										}
										else if (n!=1 && n!=2 && n!=3){
											System.out.println("Error. You have to enter a number from 1 to 3 to choose one of the three arrays entered before. Restart the program...");
										}
								}
								break;
			    		case 4:
			       		out=true;
								System.out.println();
								System.out.print("Leaving the menu...");
								System.out.println();
								break;
				    	default:
			      		System.out.println("Error! Not available option...");
								break;
						}
				}catch(InputMismatchException e){
					System.out.println("Error! You must enter a whole number. Try again.");
				  lector.next();
				}
			}
			System.out.println();
			System.out.println("End of menu.");
			System.out.println();
		}
		/** name: real_num_div
		* This method calculates the division of the whole part of real numbers.
		* <b> Pre: </b> The two numbers used were already successfully transformed to whole numbers.
		* <b>post:</b> The division of the whole part of the real numbers entered has been calculated.
		* @param whole1 It's the the whole part of the first real number entered by the user. whole1 = int, whole1 !=0
		* @param whole2 It's the the whole part of the second real number entered by the user. whole2 = int, whole2 !=0
		* @return Returns the division of the whole part of the real numbers.
		*/
		public static int quotientWhole(int whole1, int whole2){
			int div=whole1/whole2;
			return div;
		}
		/** name: residual_div
		* This method calculates the residual of the whole part of real numbers.
		* <b> Pre: </b> The whole part of the real numbers used was already successfully divided.
		* <b>post:</b> The residual of the whole part of the real numbers entered has been calculated.
		* @param whole1 It's the the whole part of the first real number entered by the user. whole1 = int, whole1 !=0
		* @param whole2 It's the the whole part of the second real number entered by the user. whole2 = int, whole2 !=0
		* @return Returns the residual of the whole part of the real numbers.
		*/
		public static int residualWhole(int whole1, int whole2){
			int residual=whole1%whole2;
			return residual;
		}
		/** name: averagearray1
		* This method calculates the average of the whole numbers entered in the first array by the user.
		* <b> Pre: </b> The array of numbers is already filled
		* <b>post:</b> The average of the whole numbers of the first array has been calculated
		* @param array1 It's the first array entered by the user. array1 != null, array1 != " "
		* @param length1 It's the length of the first array entered by the user. length1 = int, length1 !=0
		* @return Returns a real number with the average calculation
		*/
		public static double calculateAverage1(int[] array1, int length1){
			int sum=0;
			for (int i=0; i<array1.length; i++)
				sum+=array1[i];
			double average=((double)sum)/((double)length1);
			return average;
		}
		/** name: averagearray2
		* This method calculates the average of the whole numbers entered in the second array by the user.
		* <b>pre:</b> The array of numbers is already filled.
		* <b>post:</b> The average of the whole numbers of the second array has been calculated
		* @param array2 It's the second array entered by the user. array2 != null, array2 != " "
		* @param length2 It's the length of the second array entered by the user. length2 = int, length2 !=0
		* @return Returns a real number with the average calculation
		*/
		public static double calculateAverage2(int[] array2, int length2){
			int sum=0;
			for (int i=0; i<array2.length; i++)
				sum+=array2[i];
			double average=((double)sum)/((double)length2);
			return average;
		}
		/** name: averagearray3
		* This method calculates the average of the whole numbers entered in the third array by the user.
		* <b>pre:</b> The array of numbers is already filled.
		* <b>post:</b> The average of the whole numbers of the third array has been calculated
		* @param array3 It's the third array entered by the user. array3 != null, array3 != " "
		* @param length3 It's the length of the third array entered by the user. length3 = int, length3 !=0
		* @return Returns a real number with the average calculation
		*/
		public static double calculateAverage3(int[] array3, int length3){
			int sum=0;
			for (int i=0; i<array3.length; i++)
				sum+=array3[i];
			double average=((double)sum)/((double)length3);
			return average;
		}
		/** name: numhigherarray1
		* This method calculates the higher value of the values entered in the first array by the user.
		* <b>pre:</b> The array of numbers is already filled.
		* <b>post:</b> The higher value of the values of the first array has been determined
		* @param array1 It's the first array entered by the user. array1 != null, array1 != " "
		* @param posi It's a position in the array. posi = int
		* @return Returns a whole number with the higher value of the array
		*/
		public static int calculateHigher1(int[] array1, int posi){
			int numH=array1[0];
			for (int i=1;i<array1.length;i++){
				if (array1[i]>numH){
					numH=array1[i];
					posi=i;
				}
			}
			return numH;
		}
		/** name: numhigherarray2
		* This method calculates the higher value of the values entered in the second array by the user.
		* <b>pre:</b> The array of numbers is already filled.
		* <b>post:</b> The higher value of the values of the second array has been determined
		* @param array2 It's the second array entered by the user. array2 != null, array2 != " "
		* @param posi It's a position in the array. posi = int
		* @return Returns a whole number with the higher value of the array
		*/
		public static int calculateHigher2(int[] array2, int posi){
			int numH=array2[0];
			for (int i=1;i<array2.length;i++){
				if (array2[i]>numH){
					numH=array2[i];
					posi=i;
				}
			}
			return numH;
		}
		/** name: numhigherarray3
		* This method calculates the higher value of the values entered in the third array by the user.
		* <b>pre:</b> The array of numbers is already filled.
		* <b>post:</b> The higher value of the values of the third array has been determined
		* @param array3 It's the third array entered by the user. array3 != null, array3 != " "
		* @param posi It's a position in the array. posi = int
		* @return Returns a whole number with the higher value of the array
		*/
		public static int calculateHigher3(int[] array3, int posi){
			int numH=array3[0];
			for (int i=1;i<array3.length;i++){
				if (array3[i]>numH){
					numH=array3[i];
					posi=i;
				}
			}
			return numH;
		}
		/** name: unionarrayrep
		* This method generates a new array with the union of the three arrays entered by the user.
		* <b>pre:</b> The array of numbers is already filled.
		* <b>post:</b> The new array with the union of the three arrays has been created.
		* @param array1 It's the first array entered by the user. array1 != null, array1 != " "
		* @param array2 It's the second array entered by the user. array2 != null, array2 != " "
		* @param array3 It's the third array entered by the user. array3 != null, array3 != " "
		* @return Returns the new array with the union of the three arrays.
		*/
		public static int[] arraywithrep(int[] array1, int[] array2, int[] array3){
			int[] arrayunion=new int[array1.length+array2.length+array3.length];
			int i=0;
			int t=0;
			int r=0;
			int z=0;
			while (i<array1.length && t<array2.length && r<array3.length){
				for (int k=0;k<array1.length;k++){
					arrayunion[z]=array1[i+k];
					z++;
				}
				for (int k=0;k<array2.length;k++){
					arrayunion[z]=array2[t+k];
					z++;
				}
				for (int k=0;k<array3.length;k++){
					arrayunion[z]=array3[r+k];
					z++;
				}
				i+=array1.length;
				t+=array2.length;
				r+=array3.length;
			}
			return arrayunion;
		}
	}
