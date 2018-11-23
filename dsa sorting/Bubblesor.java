package DSA.sorting;




public class Bubblesor
t{

    void BSort(int[] a, int n)
{

        for (int i = 0; i < a.length-1; i++)
{
                for (int j = 0; j < a.length - i-1 ; j++)
{

                    if (a[j] > a[j + 1]){

                        int temp = a[j];

                        a[j] = a[j + 1];

                        a[j + 1] = temp;

                    }

                }

            }

       }


     public static void main(String args[])
{

            int[] a = { 9, 8, 7, 4, 3 ,12,89,20};

           
 Bubblesor b  = new Bubblesor();

            b.BSort(a, 8);

            System.out.println("Sorted element");

            for (int i = 0; i < a.length; i++)
{
 
               System.out.println(a[i]);

            }

     	}

    }

