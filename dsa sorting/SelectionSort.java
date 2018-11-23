 package DSA.sorting;


    class SelectionSort

    {

        
        void selection(int[] a,int n)

        {

            int min, mi;


            for (int i = 1; i < 5; i++)

            {

                min = a[i - 1];

                mi = i - 1;

                for (int j = i; j < 5; j++)

                {
 
                   if (min > a[j])

                    {

                        min = a[j];

                        mi = j;

                    }

                }


                int temp = a[i-1];

                a[i-1]= a[mi];

                a[mi] = temp;

            }


        }

      public  static void main(String args[])

        {

            int[] a = { 9, 8, 7, 6, 15 };

            SelectionSort ss = new SelectionSort();

            ss.selection(a, 5);

            System.out.println("Sorted Element");

            for (int i = 0; i < 5; i++)

            {
 
               System.out.println(a[i]);

            }


        }

    }
