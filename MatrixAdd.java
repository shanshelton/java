import java.util.Scanner;
public class MatrixAdd{
public static void main(String[]args)
{
int row,col,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of rows:");
row=s.nextInt();
System.out.println("Enter the number of columns:");
col=s.nextInt();
int mat1[][]=new int[3][3];
int mat2[][]=new int[3][3];
int res[][]=new int[3][3];
System.out.println("Enter the elements of matrix1:");
for(i=0;i<row;i++){
for(j=0;j<col;j++)
mat1[i][j]=s.nextInt();
System.out.println();
}
System.out.println("Enter the elements of matrix2:");
for(i=0;i<row;i++){
for(j=0;j<col;j++)
mat2[i][j]=s.nextInt();
System.out.println();
}
for(i=0;i<row;i++)
for(j=0;j<col;j++)
res[i][j]=mat1[i][j]+mat2[i][j];
System.out.println("Sum of matrix:");
for(i=0;i<row;i++){
for(j=0;j<col;j++)
System.out.print(res[i][j]+"\t");
System.out.println();
}
  }
   }
