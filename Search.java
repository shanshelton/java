import java.util.Scanner;
public class Search {
public static void main(String args[]) {
Scanner s= new Scanner(System.in);
System.out.println("Enter your choice \n 1.Linear search\n 2.Binary search");
int ch=s.nextInt();
if(ch==1){
int i,num,n,c=0,pos=0;
System.out.println("Enter the array size: ");
n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter array elements: ");
for(i=0;i<n;i++)
arr[i]=s.nextInt();
System.out.println("Enter the element to be searched : ");
num=s.nextInt();
for(i=0;i<n;i++) {
if(arr[i]==num) {
c=1;
pos=i+1;
break;
} }
if(c==0)
System.out.println("Number not found ");
else
System.out.println(num+ " found at position "+pos);
}
else if(ch==2)
{
int n,i,search,middle,flag=0;
System.out.println("Enter the number of elements : ");
n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter elements in sorted order: ");
for(i=0;i<n;i++)
arr[i]=s.nextInt();
System.out.println("Enter the element to be searched : ");
search=s.nextInt();
int first=0,last=n-1;
while(first<=last)
{
middle=(first+last)/2;
if(arr[middle]<search)
first=middle+1;
else if(arr[middle]==search)
{
System.out.println(search + " found at location " +(middle+1));
flag=1;
break;
}
else
last=middle-1;
}
if(flag==0)
System.out.println("Number not found");
} } }
